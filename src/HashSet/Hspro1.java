package HashSet;
/*
 * Unordred collection of elements where the sequence is not maintined
 * Dupliacte elemets are not allowed
 */
import java.util.*;

public class Hspro1 {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
         h.add("Niki");
         h.add("Ravi");
         h.add("Aiki");
         h.add("Niki");
         System.out.println(h);
         System.out.println(h.size());
         Iterator il = h.iterator();
         while(il.hasNext())
         {
        	 System.out.println(il.next());
         }
         ArrayList al= new ArrayList(h);
         Collections.sort(al);
         System.out.println(al);
         
	}

}
