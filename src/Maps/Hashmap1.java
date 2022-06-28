package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h= new HashMap<>();
		h.put(1, "niki");
		h.put(2, "aiki");
		h.put(3, "ravi");
		h.put(1, "run");
		System.out.println(h);
		System.out.println(h.get(1));
		int id =1;
	    if(h.containsKey(id))
	    {
	    	System.out.println(h.get(id));
	    }
	    
	    Set s= h.entrySet();
        Iterator il = s.iterator();
        while(il.hasNext())
        {
        	Map.Entry mp= (Map.Entry)il.next();
        	System.out.println(mp.getKey() +"="+ mp.getValue());
        	//System.out.println(mp.getValue());
        }
	}

}
