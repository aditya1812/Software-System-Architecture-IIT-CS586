package Accounts;
import MDAEFSM.*;
import DataStore.*;


public class Account1
{
    /* Object to MDAEFSM */
    MDAEFSM m = null;
    /* Object to DataStore */
    DataStore ds = null;	
	
    /*Store object of MDAEFSM in m and Object of DataStore in ds*/
    public Account1(MDAEFSM m,DataStore ds) 
    {
        this.m = m;
        this.ds = ds;    
    }

    public void open(String p,String y,float a)
    {   /*Store p, y, a in temp_p, temp_y, temp_a*/
    	((DataStore1)ds).temp_p = p;
        ((DataStore1)ds).temp_y = y;
        ((DataStore1)ds).temp_a = a;
    	m.Open();
    }
    
    public void pin( String x )
    {
    	if( x.equals(((DataStore1)ds).temp_p ) )    /*Compre pin in DataStore1*/
    	{
    		if( ((DataStore1)ds).temp_a > 500 )
    			m.CorrectPinAboveMin();
    		else
    			m.CorrectPinBelowMin();
    	}
    	else
    	{
    		m.IncorrectPin(3);
    	}
    }
    
    public void deposit(float d)
    {
    	((DataStore1)ds).temp_d = d; /*Store d in temp_d*/
    	m.Deposit();
    	
    	if( ((DataStore1)ds).temp_a > 500 )
    	{
    		m.AboveMinBalance();
    	}
    	else
    	{
    		m.BelowMinBalance();
    	}
    }
    
    public void withdraw(float w)
    {
    	((DataStore1)ds).temp_w = w; /*Store w in temp_w*/
    	m.Withdraw();
    	
    	if( ((DataStore1)ds).temp_a > 500 )
    	{
    		m.AboveMinBalance();
    	}
    	else
    	{
    		m.WithdrawBelowMinBalance();
    	}
    }
    
    public void balance()
    {
    	m.Balance();
    }
    
    public void login(String y)
    {
        if( y.equals(((DataStore1)ds).temp_y ) ) /*Compare ID in DataStore*/
            m.Login();
        else
            m.IncorrectLogin();
    }
            
    
    public void lock(String x)
    {
    	if( x.equals(((DataStore1)ds).temp_p ) ) /*Compare Pin in DataStore*/
    	m.Lock();
    	else
    		System.out.println("Account 1...Lock Pin does not match");
    }
    
    public void unlock(String x)
    {
    	if( x.equals(((DataStore1)ds).temp_p ) ) /*Compare Pin in DataStore*/
    	{
    		m.Unlock();
    	
    		if( ((DataStore1)ds).balance > 500 )
    		{
    			m.AboveMinBalance();
    		}
    		else
    		{
    			m.BelowMinBalance();
    		}
    	}
    	else
    		m.IncorrectUnlock();

    }
    
    public void logout()
    {
        m.Logout();
    }
	
}
