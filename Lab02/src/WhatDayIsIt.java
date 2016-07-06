import java.util.Scanner;

public class WhatDayIsIt {

	public static void main(String[] args) {
		
		do {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the Day:");
			
			
			String day = scan.nextLine();
			if(day.equalsIgnoreCase("quit"))
				System.exit(0);
			System.out.println("Please enter the Month:");
			String month = scan.nextLine();
			System.out.println("Please enter the Year:");
			String year = scan.nextLine();
			int day1 = Integer.parseInt(day); 
			int month1 = Integer.parseInt(month);
			int year1 = Integer.parseInt(year);
			
			if(month1 == 1 || month1 == 2)
			{
				month1 += 12;
				year1 -= 1;
			}
			double a1 = (13 * (month1 +1)) / 5;
			int a = (int) a1;
			int b =  (int)(year1/4);
			int c =  6 * (int)(year1/100);
			int d = (int)(year1 / 400);
			
			
			int result = a+b+c+d+year1+day1;
			result %= 7;
			
			switch (result) {
			case 0: System.out.println("a Saturday");
				
				break;
			
			case 1: System.out.println("a Sunday");
			
			break;
			case 2: System.out.println("a Monday");
			
			break;
			case 3: System.out.println("a Tuesday");
			
			break;
			case 4: System.out.println("a Wednesday");
			
			break;
			case 5: System.out.println("a Thursday");
			
			break;
			case 6: System.out.println("a Friday");
			
			break;
		
			default:
				break;
			}
			
		} while (true);
				
		

	}

}
