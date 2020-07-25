
class SingletonPattern {

	private static SingletonPattern single_instance = null;
	public String str;
	private SingletonPattern()
	{
	str = "Consider a string belonging to Singleton Class";
	}
	
	public static SingletonPattern getInstance() //creating instance of singleton class
	{
	if (single_instance == null)
	single_instance = new SingletonPattern();

	return single_instance;
	}
	}

	class Singleton_Patterns
	{
	public static void main(String args[])
	{
	SingletonPattern sub1 = SingletonPattern.getInstance();
	SingletonPattern sub2 = SingletonPattern.getInstance();
	SingletonPattern sub3 = SingletonPattern.getInstance();
	sub1.str = (sub1.str).toUpperCase();

	System.out.println("String from sub1 is " + sub1.str);
	System.out.println("String from sub2 is " + sub2.str);
	System.out.println("String from sub3 is " + sub3.str);
	System.out.println("\n");

	sub3.str = (sub3.str).toLowerCase();

	System.out.println("String from sub1 is " + sub1.str);
	System.out.println("String from sub2 is " + sub2.str);
	System.out.println("String from sub3 is " + sub3.str);
	}
	} 
	
	
