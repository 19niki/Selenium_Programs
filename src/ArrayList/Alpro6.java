/*
 * Generic collections - It is used to store group of elemst of same type 
 *  Syntax : Collection_type<type> identifer;
 *  ex     : ArrayList<Integer> al;
 *  
 *  To create the generic collection object
 *   new ArrayList<Integer>();
*/
package ArrayList;

import java.util.ArrayList;

public class Alpro6 {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(90);
	al.add(89);
	al.add(55);
	al.add(null);
	//al.add('a'); //cte
	//al.add("niki") //cte
	int a = al.get(1);
	System.out.println(a);
	System.out.println(al);

	}

}
