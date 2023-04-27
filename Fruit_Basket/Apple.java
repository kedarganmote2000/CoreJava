package com.app.Fruits;

public class Apple extends Fruit{

	public Apple(String color, String name, double weight, boolean fresh) {
		super(color, name, weight, fresh);
	}
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
   public void jam() {
   System.out.println("Name: "+getName()+" Making Jam!");
   }
@Override
public Apple getdetail() {
	
	return this;
}
@Override
public String toString() {
	
	return super.toString();
    }
           
}
