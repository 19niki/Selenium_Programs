/*
 *  Genric collection
 */
package ArrayList;

import java.util.ArrayList;

public class Alpro9 {
	int bookid;
	String name;
	int price;
	Alpro9()
	{
		
	}
	
    Alpro9(int bookid,String name,int price)
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
		ArrayList al = new ArrayList();
		al.add(new Alpro9(17,"niki",89));
		al.add(new Alpro9(87,"aiki",99));
		
		for(int i=0; i<al.size();i++)
		{
			Alpro9 temp = (Alpro9)al.get(i);
			temp.bookdetails();
			
			
	    }

}
}