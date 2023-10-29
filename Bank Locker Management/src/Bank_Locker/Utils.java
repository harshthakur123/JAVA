package Bank_Locker;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	public static List<Bank> populatebank() {
		
		List<Bank> b=new ArrayList<>();
		b.add(new Bank("Harsh", 50000));
		b.add(new Bank("Mayank", 60000));
		b.add(new Bank("Akash", 70000));
		b.add(new Bank("Rahul", 80000));
		b.add(new Bank("Chintu", 90000));
		
	return b;
}
}

