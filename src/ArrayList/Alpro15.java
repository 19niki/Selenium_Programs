/*
 * To covert the array to arraylist
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alpro15 {

	public static void main(String[] args) {
		String [] fruit = new String[5];
		fruit[0] = "mango";
		fruit[1] = "apple";
		fruit[2] = "pinapple";
		fruit[3] = "bananna";
		
		List al = new ArrayList <> ();
		al =Arrays.asList(fruit);
		System.out.println(al);

	}

}
