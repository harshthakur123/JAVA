package com.core.Mess;

public enum MessPlan {
	MONTHLY(3000), QUARTERLY(11700), HALFYEARLY(17500), YEARLY(32000);
	
	private double monthlyPrice;
	
	 MessPlan(double monthlyPrice) {
	 this.monthlyPrice=monthlyPrice;
	}
	
	 public static int getDuration(MessPlan selectedPlan) {
	
		 if(selectedPlan.equals(MONTHLY))
		 return 1;
		if(selectedPlan.equals(QUARTERLY))
			 return 3;
		if(selectedPlan.equals(HALFYEARLY))
			 return 6;
		if(selectedPlan.equals(YEARLY))
			 return 12;
		return 0;
					
	 }

	
	

	public void setMonthlyPrice(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}

	public double getMonthlyPrice() {
		
		return monthlyPrice;
	}

	public boolean equals(String plan) {
		this.name().equals(plan);
		// TODO Auto-generated method stub
		return true;
	}
		
	
}
