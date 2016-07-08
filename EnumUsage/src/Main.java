import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {ThreadLocalRandom.current().nextInt(0, 5),ThreadLocalRandom.current().nextInt(0, 5),ThreadLocalRandom.current().nextInt(0, 5)};
		System.out.println(WheelStates.values()[array[0]]+":"+WheelStates.values()[array[1]]+":"+WheelStates.values()[array[2]]);
		
		

	}

}
