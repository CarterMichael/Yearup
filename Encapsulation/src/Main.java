
public class Main {

	public static void main(String[] args) 
	
	{
		Person Overlord=new Person("MichaelCarter",18,"6786767676","123 sesame street");
	
System.out.println("Overlords name is "+ Overlord.Getname());
System.out.println("Overlords age is "+ Overlord.GetAge());
System.out.println("Overlords phone number is "+ Overlord.GetPhoneNumber());
System.out.println("Overlords address is "+ Overlord.GetAddress());
System.out.println("It is December 3rd,2015 today");
Overlord.GrowsOlder();
System.out.println("Overlord's age is now "+Overlord.GetAge());
}
}
