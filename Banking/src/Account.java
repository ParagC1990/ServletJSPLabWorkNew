
public abstract class Account {
	
	private long balance;
	private String holderName;
	public Account(String holderName) {
		super();
		this.holderName = holderName;
	}
	
	public final void transaction(String message, long amount)
	{
		System.out.println("Holder's Name: " + this.holderName);
		System.out.println("Message: " + message);
		System.out.println("Amount: " + amount);
		balance += amount;
	}
	
	public long getBalance(){
		return this.balance;
	}

	
	public abstract boolean deposit(long amount);
	public abstract boolean withdraw(long amount);
	
	
}
