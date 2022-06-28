/* To remove the element in the list  
 * 
 */
package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Alpro13 {
	int id;
	String color;
	int price;
	Alpro13()
	{
		
	}
	
    Alpro13(int id,String color,int price)
    {
    	this.id=id;
    	this.color=color;
    	this.price=price;
    }

	public static void main(String[] args)
	{
		ArrayList<Alpro13> al = new ArrayList<Alpro13>();
		al.add(new Alpro13(12,"White",500000));
		al.add(new Alpro13(76,"red",760000));
		al.add(new Alpro13(65,"green",500000));
		ListIterator<Alpro13> li = al.listIterator();
		System.out.println("To Remove car which color is white");
		Alpro13 temp = li.next();
		
		while(li.hasNext())
		{
		    
		    	
		    	if(temp.color.equalsIgnoreCase("White"))
		    	{
		    		li.remove();
		    	}
		    	
		    
		}
		
		System.out.println(al.size());
	}

}
