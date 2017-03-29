/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import MDAEFSM.*;
import OP.*;
import AbstractFactory.ConcreteFactory1;
import AbstractFactory.ConcreteFactory2;
import Accounts.*;
import java.io.*;
import Strategy.*;
/**
 *
 * @author 5CB4125SDX0
 */
public class Driver {
    public static void main( String[] args) throws IOException
    {
    	
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	String input = null;
    	int choice = 1;
    	
		System.out.println(" ---------- Select Account ----------" );
		System.out.println("          1. Account: 1" );
		System.out.println("          2. Account: 2" );
		 
		input = bufferedReader.readLine();
		if(input.equalsIgnoreCase("1"))
		{
			
	    	ConcreteFactory1 cf = new ConcreteFactory1();
	    	Output op = new Output(cf,cf.GetDataStore());
	    	MDAEFSM m = new MDAEFSM(cf,op);
	    	Account1 acc = new Account1(m,cf.GetDataStore());
	    	
	    	float balance,deposit,withdraw;
	    	String PIN,ID;
    	
	    	System.out.println("--------------------------------------------");
	        System.out.println("          Account: 1" );	
	        System.out.println("          MENU of Operations" );
	        System.out.println("          1. open(String,String,flost)" );
	        System.out.println("          2. Login(String)" );
                System.out.println("          3. Pin(String)");
	        System.out.println("          4. deposit(deposit)" );
	        System.out.println("          5. withdraw(withdraw)" );
	        System.out.println("          6. balance(balance)" );
	        System.out.println("          7. logout()" );
	        System.out.println("          8. lock(PIN)" );
	        System.out.println("          9. unlock(PIN)" );
	        System.out.println("          e. Quit the demo program" );	

	          
	        while (true) 
	        {
	        	
	        	System.out.println("Select Operation: ");
	        	System.out.println("1-open,2-login,3-pin,4-deposit,5-withdraw,6-balancce,7-logout,8-lock,9-unlock");
	             
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("e"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
	      			
		      	    case 1:   //open
		      			System.out.println("\n  Operation:  open(String PIN, String ID, float balance)");
		      			System.out.println("Enter value of the PIN:");
		      			PIN = bufferedReader.readLine();
                                        
                                        System.out.print("Enter value of ID:");
                                        ID = bufferedReader.readLine();
                                        
                                        System.out.println("Enter value of the balance:");
		      			input = bufferedReader.readLine();
		      			balance = Float.parseFloat(input);
		      			acc.open(PIN,ID,balance);
		      			
		      			break;
                                        
                            case 2:  //login
                                        System.out.println("    Operation: login(String y)");
                                        System.out.println("Enter Login ID: ");
                                        ID = bufferedReader.readLine();
                                        acc.login(ID);
                                        break;
	
		      	    case 3:  //pin
		      			System.out.println("  Operation:  pin(String x)");
		      			System.out.println("Enter PIN:");
		      			PIN = bufferedReader.readLine();
		      			acc.pin(PIN);
		      			break;
	
		      	    case 4:  //deposit
		      			System.out.println("  Operation:  deposit(float d)");
		      			System.out.println("Enter the amount to be deposited:");
		      			input = bufferedReader.readLine();
		      			deposit = Float.parseFloat(input);
		      			acc.deposit(deposit);
		      			break;
		      				
		      	    case 5:  // withdraw
		      			System.out.println("  Operation:  withdraw(float w)");
		      			System.out.println("Enter value of the parameter Withdraw:");
		      			input = bufferedReader.readLine();
		      			withdraw = Float.parseFloat(input);
		      			acc.withdraw(withdraw);
		      			break;
	
		      	    case 6:  // balance
		      			System.out.println("  Operation:  balance()");
		      			acc.balance();
		      			break;
	
		      	    case 7:  // logout
		      			System.out.println("  Operation:  logout()");
      			
		      			acc.logout();
		      			break;
	
		      	    case 8:  // lock
		      			System.out.println("  Operation:  lock(String PIN)");		
		      			System.out.println("Enter the PIN to lock the account:");
		      			PIN = bufferedReader.readLine();
		      			
		      			acc.lock(PIN);
		      			break;
	
		      	    case 9:  // unlock
		      			System.out.println("  Operation:  unlock(String PIN)");
		      			System.out.println("Enter the PIN to unlock the acount:");
		      			PIN = bufferedReader.readLine();
		      			acc.unlock(PIN);
		      			break;
		      			
		      		default:
		      			System.out.println("Sorry! Please choose valid operation.");
		      			break;
	            }
	        }
	        System.out.println("Account 1 terminated....!" );
		}
		else if(input.equalsIgnoreCase("2"))
		{
	    	ConcreteFactory2 f = new ConcreteFactory2();
	    	Output op = new Output(f,f.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(f,op);
	    	Account2 acc = new Account2(mdaefsm,f.GetDataStore());
			
			
	        System.out.println("Account: 2" );
	
	        int balance,deposit,withdraw,PIN,ID;
    	
	    	System.out.println("--------------------------------------");
	        System.out.println("          Account: 2" );	
	        System.out.println("          MENU of Operations" );
	        System.out.println("          1. OPEN(int,int,int)" );
                System.out.println("          2. LOGIN(int)");
	        System.out.println("          3. PIN(int)" );
	        System.out.println("          4. DEPOSIT(int)" );
	        System.out.println("          5. WITHDRAW(int)" );
	        System.out.println("          6. BALANCE(int)" );
	        System.out.println("          7. LOGOUT()" );
                System.out.println("          8. suspend()");
                System.out.println("          9. activate()");
                System.out.println("          10. close()");
	        System.out.println("          e. Quit the demo program" );	
	          
	        while (true) {
	        	
	        	System.out.println("  Select Operation: ");
	        	System.out.println("1-OPEN,2-LOGIN,3-PIN,4-DEPOSIT,5-WITHDRAW,6-BALANCE,7-LOGOUT,8-suspend,9-activate,10-close");
	             
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("e"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
		      	    case 1:   //OPEN
		      			System.out.println("\n  Operation:  OPEN(int PIN, int ID, int balance)");
		      			
                                        System.out.println("Enter the PIN:");
		      			input = bufferedReader.readLine();
		      			PIN = Integer.parseInt(input);
                                        
                                        System.out.println("Enter the ID:");
		      			input = bufferedReader.readLine();
		      			ID = Integer.parseInt(input);
                                        
                                        System.out.println("Enter the balance:");
		      			input = bufferedReader.readLine();
		      			balance = Integer.parseInt(input);
                                        
		      			acc.OPEN(PIN,ID,balance);
		      			
		      			break;
	
		      	    case 2:  //LOGIN
                                        System.out.println("    Operation: LOGIN(int y)");
                                        System.out.println("Enter Login ID: ");                                       
                                        input = bufferedReader.readLine();
                                        ID = Integer.parseInt(input);
                                        acc.LOGIN(ID);
                                        break;
                                        
                            case 3:  //PIN
		      			System.out.println("  Operation:  PIN(int x)");
		      			System.out.println("Enter value of PIN:");
		      			input = bufferedReader.readLine();
		      			PIN = Integer.parseInt(input);
		      			acc.PIN(PIN);
		      			break;
	
		      	    case 4:  //DEPOSIT
		      			System.out.println("  Operation:  DEPOSIT(int d)");
		      			System.out.println("Enter the amount to be deposited:");
		      			input = bufferedReader.readLine();
		      			deposit = Integer.parseInt(input);
		      			acc.DEPOSIT(deposit);
		      			break;
		      				
		      	    case 5:  // WITHDRAW
		      			System.out.println("  Operation:  WITHDRAW(int w)");
		      			System.out.println("Enter amount to be withdrawn:");
		      			input = bufferedReader.readLine();
		      			withdraw = Integer.parseInt(input);
		      			acc.WITHDRAW(withdraw);
		      			break;
	
		      	    case 6:  // BALANCE
		      			System.out.println("  Operation:  BALANCE()");
		      			
		      			acc.BALANCE();
		      			break;
	
		      	    case 7:  // LOGOUT
		      			System.out.println("  Operation:  LOGOUT()");	
		      			acc.LOGOUT();
		      			break;
		      		
                            case 8:  //suspend
                                        System.out.println("  Operation: Suspend()");
                                        acc.suspend();
                                        
                                        break;
                                        
                            case 9:   //activate
                                        System.out.println("  Operation: Activate()");
                                        acc.activate();
                                        break;
                                        
                            case 10:  //close
                                        System.out.println("  Operation: Close()");
                                        acc.close();
                                        break;
		      	  default:
		      			System.out.println("Sorry! Please choose valid operation.");
		      			break;
	            }
                    
	        }
	        System.out.println("Account 2 terminated...!" );
		}
		
    }
}
