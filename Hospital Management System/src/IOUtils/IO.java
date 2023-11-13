package IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.core.Hospital.Hospital;

public class IO {

	public static void storeDetails(Map<Integer, Hospital> hosMap, String filename)
			throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(hosMap);
		}
		System.out.println("Data stored successfully!!!");
	}

	public static void restoreDetails(String filename)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			Map<Integer, Hospital> hos = (Map<Integer, Hospital>) in.readObject();
			for (Hospital h : hos.values())
				System.out.println(h);
		}
		System.out.println("Data restored successfully!!!");

	}
}
