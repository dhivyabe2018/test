class Encapsulate 
{ 
	private String Name; 
	private int Roll; 
	private int Age; 
public int getAge() 
	{ 
	return Age; 
	} 

	
	public String getName() 
	{ 
	return Name; 
	} 
	
	
	public int getRoll() 
	{ 
	return Roll; 
	} 

	
	public void setAge( int newAge) 
	{ 
	Age = newAge; 
	} 

	
	public void setName(String newName) 
	{ 
	Name = newName; 
	} 
	
	
	public void setRoll( int newRoll) 
	{ 
	Roll = newRoll; 
	} 
} 
  class Encapsulation1{
public static void main(String arg[])
{
Encapsulate obj=new Encapsulate();
obj.setName("dhivya");
obj.setAge(20);
obj.setRoll(4004);
System.out.println(" Name: "+ obj.getName());
System.out.println(" Age: "+ obj.getAge());
System.out.println(" Roll: "+ obj.getRoll());
}
}
