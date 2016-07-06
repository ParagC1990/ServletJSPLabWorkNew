import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberAnalysis {

	public static void main(String[] args) {
		System.out.println("Enter total number you intend to enter:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Please enter the numbers:");
		ArrayList<Integer> array = new ArrayList<Integer>(n);
		while(n > 0){
			array.add(scan.nextInt());
			n--;
		}
		
		double sum = 0;
		for (int i = 0; i < array.size(); i++) {
			sum = sum + array.get(i);
		}
		double mean = sum/array.size();
		
		Collections.sort(array);
		
		System.out.println("The mean of the input array is:"+mean);
		System.out.println("The smallest number of the input array is:"+array.get(0));
		System.out.println("The largest of the input array is:"+array.get(array.size()-1));
	}

}
