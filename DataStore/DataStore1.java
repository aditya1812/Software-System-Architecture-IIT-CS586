package DataStore;

/* 
 * CONCRETE CLASS : DataStore 1
 */
public class DataStore1 extends DataStore 
{
	
	/* Temporary Storage variables */
	public float temp_a;
	public String temp_p;
        public String temp_y;
	public float temp_d;
	public float temp_w;
	
	
	/* Permanent Storage Variables ******/
	public float balance;     // x is the Balance
	public String pin;  // pin String
        public String uid;     //uid is ID
	public float deposit;   // Deposit variable
	public float withdraw;   // Withdraw variable
	
	public float getBalance()
	{
                //Return Balance
		return this.balance;
	}
	
	public String getPIN()
	{
                //Return pin
		return this.pin;
	}
	
        public String getID()
        {
                //Return uid
                return this.uid;
        }
        
	public float setBalance()
	{
                //Set balance = temp_a and return balance
		return this.balance = this.temp_a;
	}
	
	public String setPIN()
	{
                //Set pin = temp_p and return pin
		return this.pin = this.temp_p;
	}
        public String setID()
	{
                //Set uid = temp_y and return uid
		return this.uid = this.temp_y;
	}
        
	public float takePenalty()
	{
                //Take penalty on the balance (balance -= 20; return balance)
		this.balance = this.balance - 20;
		this.temp_a = balance;
		return this.balance;
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
	public float Get_Deposit()
	{
                //Return deposit
		return this.deposit;
	}
	public float Get_Withdraw()
	{
                //Return withdraw
		return this.withdraw;
	}
}