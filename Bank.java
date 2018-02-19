import java.util.ArrayList;

public class Bank implements iBank {

	private ArrayList<Account> accounts;
	
	public Bank(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String displayAccount(int accNum) {
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber() == accNum) {
				return accounts.get(i).displayAccount();
			}
		}
		return "An account with the entered number does not exist.";
	}

	@Override
	public String displayAccounts(String name) {
		String info = "";
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getOwner().equals(name)) {
				info += accounts.get(i).displayAccount();
			}
		}
		if(!info.equals(""))
			return info;
		return "The entered account holder does not exist.";
	}

	@Override
	public void addAccount(String name, int accNum, double bal, boolean checking) {
		if(checking) {
			accounts.add(new CheckingAccount(name, accNum, bal));
		}
		else {
			accounts.add(new Account(name, accNum, bal));
		}
		
	}

	@Override
	public int findAccount(int accNum) {
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber() == accNum) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int findAccount(String name) {
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getOwner().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	
	
}