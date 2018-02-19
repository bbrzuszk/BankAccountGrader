
public class CheckingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.print("\nDeposit Interest Test: ");
		if(testInterestDeposit()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nTest Display: ");
		if(testDisplay()){System.out.println("Passed");}
		else{System.out.println("Failed");}
		System.out.println();
		printDisplay();
	}
	
	public static boolean testConstructor(){
		boolean passed = false;
		try{
			CheckingAccount a = new CheckingAccount("Test Owner", 12345, 10000.0);
			passed = true;
		}
		catch(Exception e){
			
		}
		return passed;
	}
	
	public static boolean testGetMethods(){
		boolean passed = false;
		try {
			CheckingAccount a = new CheckingAccount("Test Owner", 1234, 1000.0);
			if(a.getOwner().equals("Test Owner"))
				if(a.getAccNum()==1234)
					if(a.getBalance() == 1000.0)
						passed =  true;
		} 
		catch(Exception e){
				
			}
		return passed;
	
	}
	public static boolean testDeposit(){
		boolean passed = false;
		try{
			CheckingAccount a = new CheckingAccount("Test Owner", 1234, 1000.0);
			a.deposit(100);
			if(a.getBalance() == 1100.0)
				passed =  true;
		
		}
		catch(Exception e){}
		return passed;
	}
	
	public static boolean testWithdraw(){
		boolean passed = false;
		try{
			CheckingAccount a = new CheckingAccount("Test Owner", 1234, 1000.0);
			if(a.withdraw(100) == 100)
				if(a.getBalance() == 900.0)
					if(a.withdraw(1000) == -1)
						if(a.withdraw(400.01) == -1)
							passed =  true;
						
		}
		catch(Exception e){}
			return passed;
	}
	
	public static boolean testInterestDeposit(){
		boolean passed = false;
		try{
			CheckingAccount a = new CheckingAccount("Test Owner", 1234, 1000.0);
			a.depositInterest();
			if(a.getBalance() == 1012)
				passed = true;
		}catch(Exception e){}
		return passed;
	}
	
	public static boolean testDisplay(){
		boolean passed = false; 
		try{
		CheckingAccount a = new CheckingAccount("Test Owner", 1234, 1000.0);
		if(a.displayAccount().equals("Name: Test Owner\nAccount Number: 1234\nBalance: 1000.0\nInterest Rate: 1.2%"))
			passed = true;
		}
		catch(Exception e){}
		return passed;
	}
	public static void printDisplay(){
		CheckingAccount a = new CheckingAccount("Test Owner", 1234, 1000.0);
		System.out.println("Check to see your display matches the proper display");
		System.out.println("Your display returns: ");
		System.out.println(a.displayAccount());
		System.out.println("\nThe proper display is");
		System.out.println("Name: Test Owner\nAccount Number: 1234\nBalance: 1000.0\nInterest Rate: 1.2%");
	}
	
}
