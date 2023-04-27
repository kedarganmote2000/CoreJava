package com.app.Fruits;

public class Orange extends Fruit{

	public Orange(String color, String name, double weight, boolean fresh) {
		super(color, name, weight, fresh);
	}
	@Override
	public String taste() {
		return "Sour";
	}
   public void juice() {
   System.out.println("Name: "+getName()+" Weight: "+getWeight()+" Extracting Juice!");
   }
@Override
public Orange getdetail() {
	// TODO Auto-generated method stub
	return this;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
	
}
