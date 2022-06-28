/*
 * 3. List Iterator method
 *    - List Iterator method belongs to the list interface it can create the instance of the list itertor and returns the refrence.
 *      Methods of the ListIterator
 *      1. boolean hasNext()
 *      2. Object next()
 *      3. boolean hasPrevious()
 *      4. Object previous()
 *      
 /*  
  * 
  */

package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Alpro12 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("c");
		al.add("php");
		ListIterator li = al.listIterator();
		System.out.println("To print all the elemets");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("TO print the elemnts in the rev order");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		System.out.println("To print only first 2 elements");
		ListIterator i = al.listIterator(2);
		while(li.hasNext())
		{
			System.out.println(i.next());
		}

	}

}