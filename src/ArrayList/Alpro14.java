package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Alpro14 
{
int id;
int ram;
String name;
Alpro14()
{
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
Alpro14(int id, int ram, String name)
{
	this.id=id;
	this.ram=ram;
	this.name=name;
}

@Override
public String toString() {
	return "Alpro14 [id=" + id + ", ram=" + ram + ", name=" + name + "]";
}
public void details()
{
	System.out.println("Id of the laptop:"+id);
	System.out.println("Ram of the laptop:"+ram);
	System.out.println("name of the laptop:"+name);
	System.out.println("___________________________________________");
}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	ArrayList<Alpro14> al= new ArrayList<>();
	for(int i=0; i<2; i++)
	{
	System.out.println("Enter the laptop id");
	int id =sc.nextInt();
	System.out.println("Enter the ramsize");
	int ram = sc.nextInt();
	System.out.println("Enter the laptop name");
	String name = sc.next();
	al.add(new Alpro14(id,ram,name));	
	}
	
	ListIterator<Alpro14>li= al.listIterator();
	while(li.hasNext())
	{
		Alpro14 temp=li.next();
		temp.details();
    }
	//To display the all the lap top is the ramsize by the user
	System.out.println("Enter the ram size of laptop u needed");
	int fram=sc.nextInt();
	
     for(int i=0; i<al.size();i++)
		if(al.get(i).getRam()== fram)
		{
			al.get(i).details();
		}
     
     //To remove the laptop by id
     System.out.println("Enter laptop id to be removed");
 	  int fid=sc.nextInt();
 	 for(int i=0; i<al.size();i++)
 		if(al.get(i).getId()== (fid))
 		{
 			al.remove(i);
 		
 		}
 	 
 	 System.out.println("Removed element id is:"+ fid);
 	 
 	 System.out.println("Remaning laptop are");
 	for(int i=0; i<al.size();i++)
 	{
 		al.get(i).details();
 	}
 	
    }
	}
	


