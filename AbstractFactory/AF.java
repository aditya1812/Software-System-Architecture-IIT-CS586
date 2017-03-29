package AbstractFactory;
import DataStore.*;
import Strategy.*;

/*
 * INTERFACE:: Abstract Factory PATTERN starts here
 */
public interface AF 
{
        //Create objects for all the MDAEFSM actions.
	public DataStore CreateDataStore();
        public IncorrectIDMsg CreateIncorrectIDMsg();
	public IncorrectPinMsg CreateIncorrectPinMsg();
	public TooManyAttemptsMsg CreateTooManyAttemptsMsg();
	public DisplayMenu CreateDisplayMenu();
	public StoreData CreateStoreData();
	public PromptForPin CreatePromptForPin();
	public DisplayBalance CreateDisplayBalance();
	public MakeDeposit CreateMakeDeposit();
	public MakeWithdraw CreateMakeWithdraw();
        public IncorrectLockMsg CreateIncorrectLockMsg();
        public IncorrectUnlockMsg CreateIncorrectUnlockMsg();
        public NoFundsMsg CreateNoFundsMsg();
	public Penalty CreatePenalty();
}
