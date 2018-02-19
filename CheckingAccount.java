public class CheckingAccount extends Account implements iCheckingAccount{
	
	private double interestRate;
	private double minimumBalance; 
	
	public CheckingAccount(String owner, int accountNumber, double balance) {
		super(owner, accountNumber, balance);
		this.interestRate = .012;
		this.minimumBalance = 500.0;
	}
	
	@Override
	public double withdraw(double amount) {
		if(balance - amount >= minimumBalance) {
			balance -= amount;
			return amount;
		}
		return -1;
	}
	
	@Override
	public void depositInterest() {
		balance += (Math.floor(balance * interestRate * 100.0) / 100.0);
		
	}
	
	@Override
	public String displayAccount() {
		String accountInfo = super.displayAccount() + "Interest Rate: " + interestRate * 100.0 + "%\n";
		return accountInfo;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	
	
		
	
}