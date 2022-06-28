// Example for the non - genric collection
package ArrayList;

import java.util.ArrayList;

public class Alpro8 {
	int bookid;
	String name;
	int price;
	Alpro8()
	{
		
	}
	
    Alpro8(int bookid,String name,int price)
    {
    	this.bookid=bookid;
    	this.name=name;
    	this.price=price;
    }
    public void bookdetails()
    {
    	System.out.println("id of the book is:"+bookid);
    	System.out.println("name of the book is:"+name);
    	System.out.println("price of the book is:"+price);
    }
	public static void main(String[] args)
	{
		ArrayList<Alpro8> al = new ArrayList<Alpro8>();
		al.add(new Alpro8(17,"niki",89));
		al.add(new Alpro8(87,"aiki",99));
		for(int i=0; i<al.size();i++)
		{
			al.get(i).bookdetails();
		}
		}
}
		
