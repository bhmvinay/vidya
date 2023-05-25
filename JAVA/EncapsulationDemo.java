class Encapsulate 
{
	private String greekName; 
	private int greekRoll; 
	private int greekAge; 
 
	public void setAge(int newAge)
		{
 			greekAge = newAge; 
		} 
 	public void setName(String newName)
		{ 
			greekName = newName; 
 		}
	public void setRoll(int newRoll) 
 		{
 			greekRoll = newRoll; 
 		} 
 	public String getName() 
 		{ 
 			return greekName; 
 		} 
 	public int getRoll() 
 		{ 
 			return greekRoll; 
 		} 
 	public int getAge()
 		{ 
 			return greekAge; 
 		} 
} 
class EncapsulationDemo 
{ 
 	public static void main(String[] args) 
 	{ 
 		Encapsulate obj = new Encapsulate();
		obj.setName("Manoj"); 
 		obj.setAge(18); 
 		obj.setRoll(19); 
 		System.out.println("Greek's name: " + obj.getName()); 
		System.out.println("Greek's age: " + obj.getAge()); 
 		System.out.println("Greek's roll: " + obj.getRoll()); 
 	} 
} 