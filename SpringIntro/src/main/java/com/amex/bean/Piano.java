package com.amex.bean;

public class Piano {
	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String playMusic() {
		return "The cost of this beautiful piano is " + this.getPrice();
	}
}
