/*
 * To access the element of the array list - We can access the elemets using below methods
 *  1. Using the get method  - get()
 *  2. Using the Iterator method - iterator()
 *  3. Using the listIterator method - listIterator()
 *  4. Using the foreach method - foreach()
 */
//1. Using the get() method - it returns the element from the array listpresent at the given box.
package ArrayList;

import java.util.ArrayList;

public class Alpro4 {

	public static void main(String[] args) 
	{
	  ArrayList al = new ArrayList();;
	  al.add(98);
      al.add(0, "niki");
      al.add(66);
      
      
      System.out.println(al.get(0)); //niki
	  System.out.println(al.get(al.size()-1)); //66
	  System.out.println(al);
	 
	  int a= (Integer)al.get(1); //To store 
	  System.out.println(a);
	}

}
