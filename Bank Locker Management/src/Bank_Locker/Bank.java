package Bank_Locker;

public class Bank {

	private int accountid;
	private String name;
	private double balance;
	private Locker obj;
	
	static private int counter=1001;
	

	public Bank(String name,double balance) {
		this.accountid=counter++;
		this.balance=balance;
		this.name=name;
		
	}
	
	public void assignLocker(int duration) {
		this.obj=new Locker(duration); 
	} 
	
	public int getAccountid() {
		return accountid;
	}
	

  	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		if (this.obj==null)
			return "\nAccountId :- " + accountid + "\nName :- " + name + "\nBalance :- " 
				+ balance + "\nNo locker facilty.";
		else
			return "\nAccountId :- " + accountid + "\nName :- " + name + "\nBalance :- " 
		+ balance + "\n"+ obj;
	}

	public Bank(int acc) {
		super();
		this.accountid = acc;
	}

	Bank(String newname) {
		this.name=newname;
		// TODO Auto-generated constructor stub
	}

	public int getLockerid() {
		Locker locObj=new Locker(accountid);
		return locObj.getLockerId();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bank) {
			return this.accountid==((Bank)obj).accountid;
		}
		return false;
	}



	private  class Locker{
		//make counter static
		private int counter=101;
		private int lockerid;
		private int duration;
		private double charges;
		
		Locker(int duration){
			this.lockerid=counter++;
			this.duration=duration;
			this.charges=charges*1000;
		}
		
		public int getLockerId()
		{
			return lockerid;
		}
		
		public String toString() {
			return "\nLocker Id :- "+lockerid+"\nDuration :- "+duration+"\nCharges :- "+charges;
		}
		
		
	} 
	
	
	
}
