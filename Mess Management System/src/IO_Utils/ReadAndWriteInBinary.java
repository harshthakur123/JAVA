package IO_Utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.core.Mess.Customer;

public class ReadAndWriteInBinary {
	

	
		public static void storeInBinary(String filename,Map<Integer, Customer>custMap) throws IOException {
			try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
				out.writeObject(custMap);
				System.out.println("Data Stored Successfully!!!");
			}
		}



	public static void restoreFromBinary(String filename) throws IOException {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			Map<Integer, Customer>custMap = (Map<Integer, Customer>)in.readObject();
			custMap.values().forEach(p->System.out.println(p));
			System.out.println("Data Restored Successfully!!!");
		}catch(Exception e) {
			e.printStackTrace();
		
		}
	}
	
}
