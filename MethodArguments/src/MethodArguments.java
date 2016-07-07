import java.util.HashMap;

public class MethodArguments {

	public static int addUp(int a, int b)
	{
		System.out.println("In add method for int");
		return (a+b) ;
	}
	
	public static double addUp(double a, double b)
	{
		System.out.println("In add method for double");
		return (a+b) ;
	}
	public static final HashMap<String, Integer> map = new HashMap<String, Integer>(){{
		
		put("zero",0); 
		put("one",1); 
		put("two",2); 
		put("three",3); 
		put("four",4); 
		put("five",5); 
		put("six",6); 
		put("seven",7);
		put("eight",8); 
		put("nine",9); 
		put("ten",10);
	}};
	
	
	
	
	public static int addUp(String a, String b)
	{
		System.out.println("In add method for strings");
		return (map.get(a) + map.get(b));
	}
	public static int addUp(int a, String string) {
		
		System.out.println("In add method for combination of int and string");
		return (a + map.get(string));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(addUp(3.2, 2.2));
		System.out.println(addUp(1, 4));
		System.out.println(addUp("one", "three"));
		System.out.println(addUp(2, 3.5));
		System.out.println(addUp(1, "three"));
	}

	

}
