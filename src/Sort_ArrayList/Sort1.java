/*
 * To sort the arraylist -  It is defined the java.util pacakge it has five static methods which helps to manipulate the collection
 * 
 * Static method of collection
 * 1. Sort(ArrayList a)
 * 2. Sort(ArrayList a, comparator c)
 * 3. reverse(ArrayList a)
 * 
 * ->We can sort the arraylist with the help of Collections.sort
 *1. Sort(arraylist o) -
 *   - Collections.sort method will sort the eleemnts presennt in the array list by using the CompareTo(Object o) of comparable interface
 *   - So it can only sort an arraylist only if the elemets present in the arraylist is comparable type. 
 * 
 *  Note:
 *  - If the element inside the arraylist is not comparable we get the class cast exeception
 *  
 */
package Sort_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort1 {

	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();
		al.add(78);
		al.add(24);
		al.add(90);
		al.add(56);
		//al.add("String"); //RTE due to arraylist is not comparable type.
		Collections.sort(al);
		System.out.println(al);
        for(int i=0; i<al.size();i++)
        {
        	System.out.println(al.get(i));
        }
	}

}
