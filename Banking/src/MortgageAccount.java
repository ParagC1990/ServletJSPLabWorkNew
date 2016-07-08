
public class MortgageAccount extends Account{


		long borrowedAmount;
		public MortgageAccount(String holderName, long amountBorrowed) {
			super(holderName);
			transaction("Initial Borrowed Amount", amountBorrowed);
		}
		@Override
		public boolean deposit(long amount) {
			transaction("Mortgage Payment", amount);
			return true;
		}
		@Override
		public boolean withdraw(long amount) {
			
			return false;
		}
		
		
		
}
