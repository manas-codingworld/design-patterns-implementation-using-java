package com.myapp.creational.prototype;

public abstract class Item implements Cloneable{
	private int price;
	private String title;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//by default shallow  copy.. if we want to to do deep copy then override this implementation
		return super.clone();
	}
}
