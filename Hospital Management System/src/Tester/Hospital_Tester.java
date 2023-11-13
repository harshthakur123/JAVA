package Tester;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import static Custom_Exceptions.HospitalExceptions.*;
import com.core.Hospital.Hospital;
import static IOUtils.IO.*;
import Enum.Department;
import static HospitalUtils.Utils.*;

public class Hospital_Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Hospital> hospital = populateMap();
			boolean exit = false;

			while (!exit) {
				System.out.println("\n1.SIGN IN\r\n" + "2.Add a new Doctor record in collection.\r\n" + "3.Display\n"
						+ "4.Display name of specified Doctor from list of Doctors having highest salary.\r\n"
						+ "5.Sort all doctor details on the basis of experience\r\n"
						+ "6.Search all Doctors who are Orthopedics.\r\n" + "7. Store data in binary file"
						+ "\n8. Restore data from binary " + "\n0.Exit from application.\r\n" + "\nEnter Choice :- ");
				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.print("Enter email :- ");
						authenticate(sc.next(), hospital);
						break;
						
					case 2:
						System.out.println("Enter doctor details :- "
								+ "DoctorID, DoctorName,Experience, DepartmentName, Email, Degree, "
								+ "JoiningDate ,Salary");
						Hospital hos = validateAlllInputs(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble());

						hospital.put(hos.getDocID(), hos);
						System.out.println("Doctor is added!!!");
						break;
						
					case 3:
						for (Hospital h : hospital.values())
							System.out.println(h);
						break;
						
					case 4:
						Double max = hospital.values().stream().map(Hospital::getSalary).max(Double::compare)
								.orElse(null);
						System.out.println("Doctor with highest salary : ");
						hospital.values().stream().filter(h -> h.getSalary() == max).forEach(
								h -> System.out.println("Name :- " + h.getDname() + "\nSalaray :- " + max + "\n"));

						break;
						
					case 5:
						System.out.println("Sorted as per experience :- \n");
						Comparator<Hospital> comp = new Comparator<Hospital>() {

							@Override
							public int compare(Hospital h1, Hospital h2) {
								if (h1.getExperience() == h2.getExperience())
									return 0;
								if (h1.getExperience() < h2.getExperience())
									return -1;

								return 1;
							}
						};
						hospital.values().stream().sorted((comp)).forEach(System.out::println);
						break;
						
					case 6:

						System.out.println("All doctors from orthopedics department :- ");
						hospital.values().stream().filter(p -> p.getDept().equals(Department.ORTHO))
								.forEach(System.out::println);
						break;
					case 7:
						System.out.println("Enter filename :- ");
						storeDetails(hospital, sc.next());
						break;
						
					case 8:
						System.out.println("Enter filename :- ");
						restoreDetails(sc.next());
						break;
						
					case 0:
						System.out.println("Exiting...");
						exit=true;
						break;
					default:
						System.out.println("Enter a valid choice");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}

}
