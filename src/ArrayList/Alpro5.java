package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Alpro5 {
	 int price;
	 String color;
	 double speed;
	 
	 Alpro5()
	 {
		 
	 }
	 Alpro5(int price, String color, double speed)
	 {
		this.price=price;
		this.color=color;
		this.speed=speed;
	 }
	public void  car_info()
	{
		System.out.println("Price of the car is:"+price);
		System.out.println("color of the car is:"+color);
		System.out.println("Speed of the car is:"+speed);
	}
	public String toString()
	{
		return color;
	}
	public static void main(String[] args) 
	{
	  ArrayList al = new ArrayList();
	  Alpro5 obj = new Alpro5();
	 al.add(new Alpro5(89819,"Red",78.90));
	 al.add(new Alpro5(78872, "white", 98.9));
	 System.out.println(al);
	 for(int i=0; i<al.size();i++)
	 {
		 Alpro5 temp = (Alpro5) al.get(i);
		 temp.car_info();
	 }
	 
	}
}