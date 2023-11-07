package IO_Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import com.core.Mess.Customer;

public class ReadWriteInChar {
	public static void storeInChar(String filename,Map<Integer, Customer>custMap) throws IOException {
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename))){
			custMap.values().stream().forEach(p->pw.println(p));
			System.out.println("Data Stored Successfully!!!");
		}
	}



public static void restoreFromChar(String filename) throws IOException {
	try(BufferedReader br=new BufferedReader(new FileReader(filename))){
		br.lines().forEach(System.out::println);
		System.out.println("Data Restored Successfully!!!");
	}
}
}