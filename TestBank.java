
public class TestBank {

	public static void main(String[] agrs){
		
		System.out.print("Constructor Test: ");
		if(testConstructor()){System.out.println("Passed");	}
		else{System.out.println("Failed");}
		
		System.out.print("\nGet method test: ");
		if(testGetMethods()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nFind Account By Number test: ");
		if(testFindAccount_byNumber()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nFind Account By Name test: ");
		if(testFindAccount_byName()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nAdd Account test: ");
		if(testAddAccount()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("Check Displays in gui");
		
	}
	
	public static boolean testConstructor(){
		boolean passed = false;
		try{
			Bank a = new Bank(Util.getAccounts());
			passed = true;
		}
		catch(Exception e){
			
		}
		return passed;
	}
	
	public static boolean testGetMethods(){
		boolean passed = false;
		try{
			Bank a = new Bank(Util.getAccounts());
			if(a.getAccounts() != null)
				passed = true;
		}catch(Exception e){}
		
		return passed;
	}
	
	public static boolean testFindAccount_byNumber(){
		boolean passed = false;
		try{
			Bank a = new Bank(Util.getAccounts());
			if(a.findAccount(3038369) == 3)
				if(a.findAccount(25)== -1)
					passed = true;
		}catch(Exception e){}
		return passed;
	}
	
	public static boolean testFindAccount_byName(){
		boolean passed = false;
		try{
			Bank a = new Bank(Util.getAccounts());
			if(a.findAccount("Stanley Horton") == 3)
				if(a.findAccount("JImbo")== -1)
					passed = true;
		}catch(Exception e){}
		return passed;
	}
	
	public static boolean testAddAccount(){
		boolean passed = false;
		try{
			Bank a = new Bank(Util.getAccounts());
			int firstSize = a.getAccounts().size();
			a.addAccount("Jim", 123, 100, false);
			a.addAccount("Bob", 987, 900, true);
			int currentSize = a.getAccounts().size();
			if (currentSize == firstSize + 2)
				if(a.getAccounts().get(currentSize -1) instanceof CheckingAccount)
					if(a.getAccounts().get(currentSize -2) instanceof Account )
						passed = true;
		}catch(Exception e){}
		return passed;
	}
}
