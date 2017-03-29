package AbstractFactory;
import DataStore.DataStore;
import DataStore.DataStore1;
import Strategy.*;



public class ConcreteFactory1 implements AF 
{
        //Create objects to every Strategy Classes for Account1.
	DataStore ds = new DataStore1();
	DisplayBalance disp_bal = new DisplayBalance1();
	DisplayMenu disp_menu = new DisplayMenu1();
	IncorrectPinMsg incorrect_pin = new IncorrectPinMsg();
        IncorrectIDMsg incorrect_id = new IncorrectIDMsg();
	MakeDeposit make_deposit = new MakeDeposit1();
	MakeWithdraw make_withdraw = new MakeWithdraw1();
	Penalty penalty = new Penalty();
	PromptForPin prompt_pin = new PromptForPin();
	TooManyAttemptsMsg too_many_attempts_msg = new TooManyAttemptsMsg();
	StoreData store_data = new StoreData1();
	IncorrectLockMsg incorrect_lock = new IncorrectLockMsg();
        IncorrectUnlockMsg incorrect_unlock = new IncorrectUnlockMsg();
        NoFundsMsg no_funds = new NoFundsMsg();
	
	public void ConcreteFactory()
	{
		
	}
        
        //Return the objects of every Strategy Class for Account1.
	public DataStore CreateDataStore()
	{
		return this.ds;
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
	public Penalty CreatePenalty()
	{
		return this.penalty;
	}
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
