/*
 * 3. Comprator Interface -
 *    - It belongs to java.util.pacakage
 *    - In Compartor interface we have one abstract method "Compare" wgich cxan accept 2 arguments
 *    
 *     1. non - genric comparator - 
 *        public int compare (Object o, object o1)
 *        {
 *        }
 *     2. Generic comparator
 *        public int compare (To1 , To2)
 *        {
 *        }
 *        ex class student implements comparator <Student>
 *        {
 *         public int compare (Student o1, Student o2)
 *         {
 *         }  
 *         
 *     - Compare method compares the first argument with the second argument and it should return integer number. 
 * Case 1: return zero(0) if first argument is same as the second argument
 * case 2: return positive number if the first argument is greater than the second argument
 * case 3: return negative number if the first argument is lessar than the second argument    
 */
package Sort_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Comprator_Sort3 implements Comparator<Comprator_Sort3>
{
 int id;
 String name; 
 int age;
 
 public Comprator_Sort3()
 {
	 
 }
	public Comprator_Sort3(int id, String name, int age) 
	{
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Student_details()
	{
		System.out.println("Details of all the students");
		System.out.println("Id of the Student is:"+id);
		System.out.println("color of the name is:"+name);
		System.out.println("Price of the age is:"+age);
		System.out.println("__________________________________________");
	}


//@Override
/*public int compare(Object o1, Object o2) {
	Comprator_Sort3 temp1 = (Comprator_Sort3)o1;
	Comprator_Sort3 temp2 = (Comprator_Sort3)o2;
	return temp1.name.compareTo(name);
}*/
@Override
//To sort by name
public int compare(Comprator_Sort3 o1, Comprator_Sort3 o2) {
	// TODO Auto-generated method stub
	return o1.name.compareTo(o2.name);
}

public static void main(String[] args)
{
ArrayList<Comprator_Sort3> al = new ArrayList<>();
al.add(new Comprator_Sort3(24,"Niki", 25));
al.add(new Comprator_Sort3(21,"xiki", 23));
al.add(new Comprator_Sort3(58,"Ravi", 72));
al.add(new Comprator_Sort3(50,"Pushpa",39));
//TO display the all the sudents
for(int i=0; i<al.size();i++)
{
	al.get(i).Student_details();
}
// TO sort the students by name
System.out.println("Sorting students by name");
Collections.sort(al, new Comprator_Sort3());
for(int i=0; i<al.size();i++)
{
	al.get(i).Student_details();
}

//To sort by name
Collections.sort(al, new SortByAge());
System.out.println("Sort by age");
for(int i=0; i<al.size();i++)
{
	al.get(i).Student_details();
}





//To search student by id
boolean sfound =false;
System.out.println("To serch the student by id");
Scanner sc= new Scanner(System.in);
int sid=sc.nextInt();
for(int i=0; i<al.size();i++)
{
	if(al.get(i).getId() == sid)
	{ 
		sfound = true;
		al.get(i).Student_details();
		
	}
}
	if(!sfound)
	{
	  System.out.println("Student not found");	
	}


}
}


//To sort by age
class SortByAge implements Comparator<Comprator_Sort3>
{

	@Override
	public int compare(Comprator_Sort3 o1, Comprator_Sort3 o2)
	{
		if(o1.age == o2.age)
		{
		return 0;
		}
		else if(o1.age >o2.age)
		{
			return 1;
		}
		else
			return -1;
		
		}
}

