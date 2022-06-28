/*
 * 2. Accessing using the iterator method  iterator():
 *    - Iterator method is present in the Java.util.iterable.interface 
 *    - Iterator method provides the mechanism to access the elememts present in the collection
 *    - Iterator() creates the instance of the itretor of the inetrface and returns the refrenec of the iterator
 *    - In iterartor interface we have below methods to access the elemts in the collection 
 *       1. public boolean hasnext() - it returns true or false
 *       2. public object next() - to acces forward  
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Alpro10 {

	public static void main(String[] args) 
	{
		
      ArrayList<String> al = new ArrayList<>();
      al.add("java");
      al.add("c#");
      al.add("ruby");
      Iterator il = al.iterator();
      while(il.hasNext())
      {
    	  System.out.println(il.next());
      }
      
	}

}
