package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Sam1 {

	public static void main(String[] args) 
	{
	   ArrayList<String> al= new ArrayList<>();
	   al.add("Nikhi");
	   al.add("Ravi");
	   al.add("aiki");
	   System.out.println(al);
	   al.add(2, "push");
	   System.out.println(al);
	   ArrayList<String> al1= new ArrayList<>();
       al1.addAll(al);
       System.out.println(al1);
       al1.remove(2);
       al1.remove("Ravi");
       System.out.println(al1);
       String a = al.get(2);
       System.out.println(a);
       Iterator il = al.iterator();
      while(il.hasNext())
       {
    	   System.out.println(il.next());
       }
      
      ListIterator li = al.listIterator(al.size());
      System.out.println("==============================");
      while(li.hasPrevious())
      {
    	  System.out.println(li.previous());
      }
      al.add("Ravi");
      System.out.println(al);
	}

}
