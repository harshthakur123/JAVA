package com.Customer;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(3000),PLATINUM(4000);
	
	double price;
	
	ServicePlan(int price){
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		
	}
	
//	@Override
//	public String toString() {
//		return name()+" : "+price;
//	}
	
}
