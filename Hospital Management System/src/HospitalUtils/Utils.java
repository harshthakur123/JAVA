package HospitalUtils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;

import com.core.Hospital.Hospital;

import Enum.Department;

public class Utils {

	public static Map<Integer, Hospital> populateMap(){
	
		Map<Integer, Hospital>hosMap=new HashMap<Integer, Hospital>();
		
		hosMap.put(001, new Hospital(001,"Nikhil", 5, Department.valueOf("ORTHO"), "nikhil123@gmail.com", 
				"MBBS", LocalDate.parse("2016-02-18"), 1000000));
		hosMap.put(002, new Hospital(002,"Akhil", 6, Department.valueOf("PEDIATRICS"), "akhil123@gmail.com", 
				"MS", LocalDate.parse("2018-05-01"), 1200000));
		hosMap.put(003, new Hospital(003, "Ashu",7, Department.valueOf("PHYSIOTHERAPY"), "ashu123@gmail.com", 
				"MD", LocalDate.parse("2019-12-23"), 1500000));
		hosMap.put(004, new Hospital(004, "Renu",3, Department.valueOf("PHYSIOTHERAPY"), "renu123@gmail.com", 
				"DO", LocalDate.parse("2021-09-15"), 1600000));
		hosMap.put(005, new Hospital(005, "Mia",8, Department.valueOf("GASTROLOGY"), "mia123@gmail.com", 
				"DMD", LocalDate.parse("2022-10-12"), 1200000));
		hosMap.put(006, new Hospital(006,"Ronit", 3, Department.valueOf("ORTHO"), "ronitl123@gmail.com", 
				"BAMS", LocalDate.parse("2015-05-19"), 1090000));
		hosMap.put(007, new Hospital(007,"Vishal", 7, Department.valueOf("ORTHO"), "vishall123@gmail.com", 
				"MBBS", LocalDate.parse("2019-02-15"), 1080000));
		
		System.out.println("Populated List!!!");
		return hosMap;
		
	}
	
}
