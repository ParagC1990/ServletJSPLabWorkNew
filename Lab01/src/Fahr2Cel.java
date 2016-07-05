import java.util.Scanner;

public class Fahr2Cel {

	public static void main(String[] args) {
		
		System.out.println("Please enter the Fahrenheit temperature: ");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		double fahr = Double.valueOf(line);
		
		double cel = 5.0 * (fahr - 32 ) / 9.0;
		System.out.println(fahr +" Fahrenheit = "+ cel +" Celsius");
		
		
		

	}

}
