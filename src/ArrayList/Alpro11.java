/*
 * To count the same price and color of the cars
 * Disadvantges of the Iterator:
 * - We cannot access the elemenst in the reverse order.
 * - We cannot modify the collection of the object 
 * 
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Alpro11 {
	int id;
	String color;
	int price;
	Alpro11()
	{
		
	}
	
    Alpro11(int id,String color,int price)
    {
    	this.id=id;
    	this.color=color;
    	this.price=price;
    }

	public static void main(String[] args)
	{
		int count=0;
		ArrayList<Alpro11> al = new ArrayList<Alpro11>();
		al.add(new Alpro11(12,"White",500000));
		al.add(new Alpro11(76,"red",760000));
		al.add(new Alpro11(65,"green",500000));
		Iterator<Alpro11> i = al.iterator();
		while(i.hasNext())
		{
			Alpro11 temp =  i.next();
			if(temp.price == 500000 && temp.color == "White")
			{
				count++;
			}
		}
		
	   System.out.println(count);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
