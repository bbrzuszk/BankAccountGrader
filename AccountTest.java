
public class AccountTest {

	public static void main(String[] args) {
		System.out.print("Constructor Test: ");
		if(testConstructor()){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		System.out.print("\nGet method test: ");
		if(testGetMethods()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nDeposit Test: ");
		if(testDeposit()){ System.out.println("Passed");}
		else { System.out.println("Failed");}

		System.out.print("\nWithdraw Test: ");
		if(testWithdraw()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nTest Display: ");
		if(testDisplay()) {System.out.println("Passed");}
		else{System.out.println("Failed");	}
		System.out.println();
		printDisplay();
	}
	
	public static boolean testConstructor(){
		boolean passed = false;
		try{
			Account a = new Account("Test Owner", 12345, 10000.0);
			passed = true;
		}
		catch(Exception e){
			
		}
		return passed;
	}
	
	public static boolean testGetMethods(){
		try{
		Account a = new Account("Test Owner", 1234, 1000.0);
		if(a.getOwner().equals("Test Owner"))
		if(a.getAccNum()==1234)
				if(a.getBalance() == 1000.0)
					return true;
		}catch(Exception e){}
		return false;
	}
	public static boolean testDeposit(){
		Account a = new Account("Test Owner", 1234, 1000.0);
		a.deposit(100);
		if(a.getBalance() == 1100.0)
			return true;
		return false;
	}
	public static boolean testWithdraw(){
		Account a = new Account("Test Owner", 1234, 1000.0);
		if(a.withdraw(100) == 100)
			if(a.getBalance() == 900.0)
				if(a.withdraw(1000) == -1)
					return true;
		return false;
	}
	public static boolean testDisplay(){
		boolean passed = false; 
		try{
		Account a = new Account("Test Owner", 1234, 1000.0);
			if(a.displayAccount().equals("Name: Test Owner\nAccount Number: 1234\nBalance: 1000.0"))
				passed = true;
		}
		catch(Exception e){}
		return passed;
	}
	public static void printDisplay(){
		try{
		Account a = new Account("Test Owner", 1234, 1000.0);
		System.out.println("Check to see your display matches the proper display");
		System.out.println("Your display returns: ");
		System.out.println(a.displayAccount());
		System.out.println("\nThe proper display is");
		System.out.println("Name: Test Owner\nAccount Number: 1234\nBalance: 1000.0");
		}
		catch(Exception e){}
	}
}
