package Custom_Exceptions;

import java.time.LocalDate;
import java.util.Map;

import com.core.Hospital.Hospital;

import Enum.Department;
import Tester.Hospital_Tester;

public class HospitalExceptions {

	public static LocalDate parseAndValidateJoiningDate(String joiningDate) throws InvalidInputException {

		if (!LocalDate.parse(joiningDate).isAfter(LocalDate.parse("2001-05-10")))
			throw new InvalidInputException("Joining date must be after 10-May-2001 !!!");

		return LocalDate.parse(joiningDate);

	}
	
	public static void authenticate(String email,Map<Integer, Hospital>hosMap) throws InvalidInputException{
		Hospital hs=new Hospital(email);
		boolean status=false;
		if(hosMap.containsValue(hs))
			status=true;
		if(status==false)
			throw new InvalidInputException("Email doesn't exist!!!");
		System.out.println("Authentication Successful!!!");
		hosMap.values().stream().filter(p->p.getEmail().equals(email)).forEach(System.out::println);
	}
	
	public static Department parseAndValidateDepartment(String dept) throws InvalidInputException {
		boolean status=false;
		for(Department d:Department.values()) {
			if(d.name().equals(dept.toUpperCase()))
				status=true;
			break;
		}
		if(status==false)
			throw new InvalidInputException("Enter a valid department!!!");
		
		return Department.valueOf(dept.toUpperCase());
		
	}
	

	public static Hospital validateAlllInputs(int docID,String dname, int experience, String dept, String email, String degree,
			String joining_date, double salary) throws InvalidInputException {

		LocalDate joining_date1=parseAndValidateJoiningDate(joining_date);
		Department parsedDept=parseAndValidateDepartment(dept);
		
		return new Hospital(docID, dname,experience, parsedDept, email, degree, joining_date1, salary);

	}

}
