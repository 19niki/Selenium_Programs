/*
 * Collections can be classifed into 2 types:
 * 1. Non - genric collections:
 *    - Here any element is added will be up-casted to the object type. We can store any value in it (Heterogenous)
 */
package ArrayList;

import java.util.ArrayList;

public class Alpro3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(56);
		al.add(67.88);
		al.add('a');
		al.add("String");
		System.out.println(al);
		System.out.println(al.remove("String"));
		System.out.println(al);
	}

}
// Everthing is converted to object type