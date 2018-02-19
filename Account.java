public class Account implements iAccounts {

	protected String owner;
	protected int accountNumber;
	protected double balance;
	
	public Account(String owner, int accountNumber, double balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getAccNum() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public double withdraw(double amount) {
		if(balance - amount >= 0) {
			balance -= amount;
			return amount;
		}
		return -1;
	}

	@Override
	public String displayAccount() {
		String accountInfo = "Name: " + owner + "\nAccount Number: "
				+ accountNumber + "\nBalance: " + balance + "\n";
		return accountInfo;
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	
		
}