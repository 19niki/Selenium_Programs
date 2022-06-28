/*
 * 2. Comparable Interface (Used to sort the objects) - 
 *     - It is defined in the java.lang.package
 *     - It has only one abstract method
 *     
 *    Public int CompareTo(Object o)
 * How to make the comparable Object comparable type
 * Step 1: Class must implement the comparable interface
 * Step 2: class must overrid  the Comapare to() method.
 * 
 * 
 * ex: 
 *  class student implements Comparable
 *  {
 *  int id;
 *  String name;
 *  public int compareTo(Object o)
 *  {
 *  if(this.sid == ((student)o).sid)
 *  {
 *  return 0;
 *  }
 *  else if(this.sid > ((student)o).sid)
 *  {
 *  return 1;
 *  }
 *  else
 *  return-1
 *  }
 *  
 *  We are invoking the object1 compare to method and passing object2 to it
 *  If the method return +ve value then Object1 is above the Object2
 *  If the method returns -ve value then Object 2 is above the Object1
 *       
 */
package Sort_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Comparable_Sort2 implements Comparable 
{
int id;
String color;
int price;
Comparable_Sort2()
{
	
}
Comparable_Sort2(int id, String color, int price)
{
   this.id=id;
   this.color=color;
   this.price=price;
		   
}
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public void pen_details()
{
	System.out.println("Id of the pen is:"+id);
	System.out.println("color of the pen is:"+color);
	System.out.println("Price of the pen is:"+price);
	System.out.println("__________________________________________");
}
public String toString()
{
	return "id" + " color" + "price";
}

@Override
public int compareTo(Object o)
{
	
	
	if(this.id == ((Comparable_Sort2)o).id)
		
	{
	return 0;
	}
	else if(this.id > ((Comparable_Sort2)o).id)
	{
		return 1;
	}
	else
		return -1;
		
	/* To sort the strings
	Comparable_Sort2 temp = (Comparable_Sort2)o;
	return this.color.compareTo(temp.getColor());*/
	
}

public static void main(String[] args) 
{
 ArrayList<Comparable_Sort2> al = new ArrayList<>();
 al.add(new Comparable_Sort2(76, "Red", 75));
 al.add(new Comparable_Sort2(54, "Blue", 75));
 al.add(new Comparable_Sort2(22, "Green", 81));
 al.add(new Comparable_Sort2(07, "Black", 63));
 //ListIterator il = al.listIterator();
 for(int i=0; i<al.size();i++)
 {
	 al.get(i).pen_details();
 }

 //To sort the array
 Collections.sort(al);
System.out.println("ArrayList after the sort");
for(int i=0; i<al.size();i++)
{
	 al.get(i).pen_details();
}

//To search the element in array
boolean pfound = false;
System.out.println("Enter the id of pen to be searched");
Scanner sc= new Scanner(System.in);
int pid = sc.nextInt();
for(int i=0; i<al.size();i++)
{
	if(al.get(i).getId() == pid)
	{
		pfound = true;
		al.get(i).pen_details();
	}
}
	if(!pfound)
	{
		System.out.println("element not found");
	}
	
//To search the element by color
	System.out.println("Enter the color of pen to be searched");	
	String color =sc.next();
	for(int i=0; i<al.size();i++)
	{
		if(al.get(i).getColor().equalsIgnoreCase(color))
		{
			pfound = true;
			al.get(i).pen_details();
		}
	}
	if(!pfound)
	{
		System.out.println("element not found");
	}
	
//To count the same price of the pens
	System.out.println("Enter the price of the pen");
	int price = sc.nextInt();
	int count =0;
	for(int i=0; i<al.size();i++)
	{
		if(al.get(i).getPrice() == price)
			
		{
			al.get(i).pen_details();
			count++;
		}
	}
    System.out.println("Number of pen of amount is:"+count);	
}
}
