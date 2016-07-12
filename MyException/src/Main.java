import java.util.Scanner;

public class Main {

	public static final int[] arr = {31, 28, 31,30, 31,30,31,31,30,31,30,31};
	
	public static boolean convert(String str, int val) throws BadMonth, BadDay {
		boolean status = true;
		try{
			Months monthVal = Months.valueOf(str);
			//System.out.println(monthVal);
			try{
				if(!(val == arr[Months.valueOf(str).ordinal()]))
					throw new Exception();
			}catch(Exception e){
				status = false;
				throw new BadDay("BadDay Exception Thrown",e);
				
			}
			finally {
				return status;
			}
			
		}catch(Exception e){
			status = false;
			
			throw new BadMonth("BadMonth Exception Thrown",e);
			
		}finally {
			return status;
		}
		
	}
	
	public static void main(String[] args) throws BadMonth, BadDay {
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Please enter the month");
			String month = scan.next();
			if(month.equalsIgnoreCase("quit"))
				System.exit(0);
			System.out.println("Please enter the day");
			int day = scan.nextInt();
			
			
			if(convert(month, day)) 
				System.out.println("The data entered was valid");
			else
				System.out.println("Invalid data entered");
			
		}
	}

}
