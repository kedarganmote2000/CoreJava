package com.app.Fruits;

public class Mango extends Fruit {

	public Mango(String color, String name, double weight, boolean fresh) {
		super(color, name, weight, fresh);
	}
	@Override
	public String taste() {
		return "Sweet";
	}
   public void pulp() {
   System.out.println("Name: "+getName()+" Color: "+getColor()+" Creating Pulp!");
   }
@Override
public Mango getdetail() {
	// TODO Auto-generated method stub
	return this;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
   
	
}
