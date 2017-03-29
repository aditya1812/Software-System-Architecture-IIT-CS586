package DataStore;

/* 
 * CONCRETE CLASS : DataStore2
 */
public class DataStore2 extends DataStore 
{
	
	/* Temporary Storage variables */
	public int temp_a;
	public int temp_p;
        public int temp_y;
	public int temp_d;
	public int temp_w;
	
	
	/* Permanent Storage Variables */
	public int balance;     // x is the Balance
	public int pin;  // pin String
        public int uid;     //uid is ID
	public int deposit;   // Deposit variable
	public int withdraw;   // Withdraw variable
	
	public int getBalance()
	{
                //Return Balance
		return this.balance;
	}
	
	public int getPIN()
	{
                //Return pin
		return this.pin;
	}
	
        public int getID()
        {
                //Return uid
                return this.uid;
        }
	public int setBalance()
	{
                //Set balance = temp_a and return balance
		return this.balance = this.temp_a;
	}
	
	public int setPIN()
	{
                //Set pin = temp_p and return pin
		return this.pin = this.temp_p;
	}
        public int setID()
	{
                //Set uid = temp_y and return uid
		return this.uid = this.temp_y;
	}
        
	
	public void Compute_Balance_deposit()
	{
                //balance = balance + deposit
		this.balance = this.balance + this.deposit;
		this.temp_a = this.balance;
	}
	public void Compute_Balance_withdraw()
	{
                //balance = balance – withdraw
		this.balance = this.balance - this.withdraw;
		this.temp_a = this.balance;
	}
	
	public void Set_Deposit()
	{
                //Set deposit = temp_d
		this.deposit = this.temp_d;
	}
	public void Set_Withdraw()
	{
                //Set withdraw = tepm_w
                this.withdraw = this.temp_w;
	}
	public int Get_Deposit()
	{
                //Return deposit
		return this.deposit;
	}
	public int Get_Withdraw()
	{
                //Return withdraw
		return this.withdraw;
	}
}