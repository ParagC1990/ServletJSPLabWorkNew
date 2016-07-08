
public class CheckingAccount extends Account{
	int overdraft;
	public CheckingAccount(String holderName, int overDraftAmount) {
		super(holderName);
		overdraft = overDraftAmount;
		
	}
	@Override
	public boolean deposit(long amount) {
		transaction("Checking Deposit", amount);
		return true;
	}
	@Override
	public boolean withdraw(long amount) {
		if((overdraft + getBalance()) >= amount){
				transaction("Checking Withdrawal", (-amount));
				return true;
		}
		return false;
	}

}
