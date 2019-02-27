class Encapsulate 
{ 
	private String geekName; 
	private int geekRoll; 
	private int geekAge; 

	
	public int getAge() 
	{ 
	return geekAge; 
	} 

	
	public String getName() 
	{ 
	return geekName; 
	} 
	
	
	public int getRoll() 
	{ 
	return geekRoll; 
	} 

	
	public void setAge( int newAge) 
	{ 
	geekAge = newAge; 
	} 

	
	public void setName(String newName) 
	{ 
	geekName = newName; 
	} 
	
	
	public void setRoll( int newRoll) 
	{ 
	geekRoll = newRoll; 
	} 
} 
 class TestEncapsulation1 
{     
    public static void main (String[] args)  
    { 
Encapsulate obj = new Encapsulate();
obj.setName("dhivya");
obj.setAge(20);
obj.setRoll(4004);
System.out.println("Geek's name: " + obj.getName());
System.out.println("Geek's age: " + obj.getAge());
System.out.println("Geek's roll: " + obj.getRoll());
}
}
