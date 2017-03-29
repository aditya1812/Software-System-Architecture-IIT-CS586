package AbstractFactory;
import DataStore.DataStore;
import DataStore.DataStore2;
import Strategy.*;



public class ConcreteFactory2 implements AF 
{
        //Create objects to every Strategy Classes for Account2.
	DataStore ds = new DataStore2();
	DisplayBalance disp_bal = new DisplayBalance2();
	DisplayMenu disp_menu = new DisplayMenu2();
	IncorrectPinMsg incorrect_pin = new IncorrectPinMsg();
        IncorrectIDMsg incorrect_id = new IncorrectIDMsg();
	MakeDeposit make_deposit = new MakeDeposit2();
	MakeWithdraw make_withdraw = new MakeWithdraw2();
	PromptForPin prompt_pin = new PromptForPin();
	TooManyAttemptsMsg too_many_attempts_msg = new TooManyAttemptsMsg();
	StoreData store_data = new StoreData2();
        Penalty penalty = new Penalty();
	IncorrectLockMsg incorrect_lock = new IncorrectLockMsg();
        IncorrectUnlockMsg incorrect_unlock = new IncorrectUnlockMsg();
        NoFundsMsg no_funds = new NoFundsMsg();
	
	public void ConcreteFactory()
	{
		
	}
        
        //Return the objects of every Strategy Class for Account2.
	public DataStore CreateDataStore()
	{
		return(this.ds);
	}
	
	public DataStore GetDataStore()
	{
		return this.ds;
	}
        
        public StoreData CreateStoreData()
        {
                return this.store_data;
        }
	
	public IncorrectPinMsg CreateIncorrectPinMsg()
	{
		return this.incorrect_pin;
	}
        public IncorrectIDMsg CreateIncorrectIDMsg()
	{
		return this.incorrect_id;
	}
	public TooManyAttemptsMsg CreateTooManyAttemptsMsg()
	{
		return this.too_many_attempts_msg;
	}
	public DisplayMenu CreateDisplayMenu()
	{
		return this.disp_menu;
	}
	public StoreData CreateStorePin()
	{
		return this.store_data;
	}
	public Penalty CreatePenalty()
        {
            return this.penalty;
        }
	public PromptForPin CreatePromptForPin()
	{
		return this.prompt_pin;
	}
	public DisplayBalance CreateDisplayBalance()
	{
		return this.disp_bal;
	}
	public MakeDeposit CreateMakeDeposit()
	{
		return this.make_deposit;
	}
	public MakeWithdraw CreateMakeWithdraw()
	{
		return this.make_withdraw;
	}
	/*public Penalty CreatePenalty()
	{
		return this.penalty;
	}*/
        public IncorrectLockMsg CreateIncorrectLockMsg()
	{
		return this.incorrect_lock;
	}
        public IncorrectUnlockMsg CreateIncorrectUnlockMsg()
	{
		return this.incorrect_unlock;
	}
        public NoFundsMsg CreateNoFundsMsg()
	{
		return this.no_funds;
	}
        
}
