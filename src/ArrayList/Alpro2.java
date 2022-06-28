/*
 *  List  
 *  - It is a intrface defined in the java.util.pacakge
 *  - List is used to store the group of objects
 *  
 *  Feature of List:
 *  - In list order of insertion of bonject is maintatined
 *  - list can have dupliacte elements
 *  - We can access the elements with the helip of index
 *  - Index always start from zero and end length is -1
 *  
 *  
 *   Methods of List Inetrface
 *  
 * ---------------------------------------------------------------------------------------------------------------------------
 * |  Purpose  |          Signature                     |           Def                                                      |
 * ---------------------------------------------------------------------------------------------------------------------------
 * |           |                                        |                                                                    |
 * |add()      |    boolean add(Object O)               | To add  the elemets into the collection                            |
 * |           |    boolean addAll(Collection C)        | To add all the elemet to collection list or to add all the elements|
 * |           |                                        | from one collection to another                                     |
 * |           |  boolean add(int index object o)       | To add element to spefic index                                     |
 * |           |  boolean addall(int index collection c)| To add element to spefic index                                     |
 * |           |                                        |                                                                    |
 * ---------------------------------------------------------------------------------------------------------------------------
 * |           |                                        |                                                                    |
 * |search()   |   boolean Conatins(Object o)           | To search the particular element                                   |                         
 * |           |   boolean ContainsAll(Collection c)    | To search a group of feild                                         |
 * |           |   int indexof(Object o)                  To search the element using particular index else return -1 if none |                 |                                                                    |
 * --------------------------------------------------------------------------------------------------------------------------- 
 * |           |                                        |                                                                    |
 * |remove()   |  boolean remove(Object o)              | To remove the dupliacte element                                    |
 * |           |  boolean removeAll(Collection c)       | To remove all the duplicate element                                |
 * |           |  boolean retainAll(Collection c)       | It keeps only elements in the original list that are contained     |  
 * |           |                                        | in the specified collection                                        |
 * |           |   void clear()                           Remove all the elements                                            |
 * ---------------------------------------------------------------------------------------------------------------------------
 * |           |                                        |                                                                    |
 * |access()   |  Iterator iterator()                   | To access the elements     
 * |           |  list Iteratot()                       |                                                                    |
 * ---------------------------------------------------------------------------------------------------------------------------
 * |sort()     |  sort()                                | To sort the elemets                                                |
 * ---------------------------------------------------------------------------------------------------------------------------
 * |size       |  int size()                            | To give the number elemets in the array                            |
 * ---------------------------------------------------------------------------------------------------------------------------
 * |equals()   |  boolean Equals()                      | To compare the two collections                                     |  
 * ---------------------------------------------------------------------------------------------------------------------------
 * |toarray()  |  Object toArray()                      | TO convert the collection to array                                 |
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ArrayList - 
 * - It is a concerte implemntion class for the list interface it provides implemenation to all the methods of list and collection interface.
 * 
 * Constructor of ArrayList-
 * 
 * ArrayList() - It creates the empty array list object
 * ArrayList(Collection C) - It creates the arraylist object and copies all the elemets present in the given collection into arraylist.
 *  
 */
package ArrayList;

import java.util.ArrayList;

public class Alpro2 {

	public static void main(String[] args) 
	{
	  ArrayList a= new ArrayList();
	     a.add(90);
	     a.add(56);
	     a.add(89);
	     System.out.println(a);
	     a.remove(2); // @nd elemet is removed
	     System.out.println(a);
	 ArrayList a1 = new ArrayList();
	 a1.addAll(a); // All the elemets of arraylist a is added to AL arraylist
	 a1.add(76);
	 System.out.println(a1);
	 a.remove(a1);
	 
	 System.out.println(a);
	 System.out.println(a1);
	 System.out.println(a1.size());
	 System.out.println(a.size());
	   
	     
	     
	  
      
	}

}
