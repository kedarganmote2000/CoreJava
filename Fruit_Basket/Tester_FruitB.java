package com.app.tester;
import com.app.Fruits.*;
import java.util.*;
public class FruitB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color,Name,Weigth,Fresh (true/false)");
		Fruit [] fr = { new Mango(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean()),
				        new Apple(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean()),
				        new Orange(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean())
				        };
		
		for(Fruit f:fr) {
			System.out.println("Name :"+f.getName());
		}
		for(Fruit f:fr) {
			System.out.println("Details :"+f.getdetail()+" Taste : "+f.taste());
		}
       System.out.println("Enter the Index(0,1,2) you want to mark stale");
       int index=sc.nextInt();
       if(index>=3) {
    	   System.out.println("Enter Valid Index");
       }
       else {
    	   System.out.println(fr[index].getName()+"= Stale");
       }
       
    	   for(Fruit f:fr) {
    		   if(f.taste().equals("Sour")) {
    			   System.out.println(f.getName()+": Stale");
    		   }
    	   }
    		   for(Fruit fp:fr) {
    			   if(fp instanceof Mango) {
    				   ((Mango)fp).pulp();
    			   }
    			   else if(fp instanceof Apple) {
    				   ((Apple)fp).jam();
    			   }
    			   else if(fp instanceof Orange) {
    				   ((Orange)fp).juice();
    			   }
    		   }
    	   
       }
	}
