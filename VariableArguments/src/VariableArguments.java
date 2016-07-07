import java.util.HashMap;

public class VariableArguments {


	public static int addUp(int... numbers)
	{
		System.out.println("In add method for int");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static double addUp(double... numbers)
	{
		System.out.println("In add method for double");
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
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
	
	
	
	
	public static int addUp(String... args)
	{
		System.out.println("In add method for strings");
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += map.get(args[i]);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(addUp(3, 2, 3.5));
		System.out.println(addUp(1, 4, 6, 7));
		System.out.println(addUp("one", "three", "nine"));
		System.out.println(addUp(2, 3.5));
		
	}


}
