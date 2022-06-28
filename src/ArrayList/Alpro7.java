/*
 * Example for the non- genric collection
 */
package ArrayList;

import java.util.ArrayList;

public class Alpro7 {
	 int price;
	 String color;
	 double speed;
	 
	 Alpro7()
	 {
		 
	 }
	 Alpro7(int price, String color, double speed)
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
	
	public static void main(String[] args)
	{
		ArrayList<Alpro7> al = new ArrayList<>();
		 al.add(new Alpro7(89819,"Red",78.90));
		 al.add(new Alpro7(78872, "white", 98.9));
		 for(int i=0; i<al.size();i++)
		 {
			al.get(i).car_info();
			
		 }
	}
}
