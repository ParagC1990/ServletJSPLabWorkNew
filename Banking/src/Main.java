
public class Main {

	public static void main(String[] args) {
		Account[] array = {new MortgageAccount("First", 100000), new CheckingAccount("Second", 200), new CheckingAccount("Third", 1000)};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].deposit(1000));
			System.out.println(array[i].getBalance());
			System.out.println(array[i].withdraw(500));
			System.out.println(array[i].getBalance());
			System.out.println(array[i].withdraw(1000));
			System.out.println(array[i].getBalance());
			System.out.println(array[i].withdraw(2000));
			System.out.println(array[i].getBalance());
		}

	}

}
