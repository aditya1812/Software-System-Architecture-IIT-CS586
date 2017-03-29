package Accounts;

import MDAEFSM.*;
import DataStore.*;


/*
 * CLASS : Account2 Implementation for collecting parameters
 * from the UI through Driver.java and invoking right event in MDAEFSM
 */

public class Account2
{
	
	/* Object of MDA-EFSM */
	MDAEFSM m = null;
	/* Object of DataStore */
	DataStore ds = null;	
	
	/*Store object of MDAEFSM in m and Object of DataStore in ds*/
        public Account2(MDAEFSM m,DataStore ds) 
	{
        this.m = m;
        this.ds = ds;
        
    }

    public void OPEN(int p,int y,int a)
    {
        /*Store p, y, a in temp_p, temp_y, temp_a*/
    	((DataStore2)ds).temp_a = a;
    	((DataStore2)ds).temp_p = p; 
        ((DataStore2)ds).temp_y = y; 
    	m.Open( );
    }
    
    public void PIN( int x )
    {
    	if( x == ((DataStore2)ds).temp_p ) /*Compre pin in DataStore2*/
    	{
            m.CorrectPinAboveMin();
    	}
    	else
    	{
    		m.IncorrectPin(2);
    	}
    }
    
    public void DEPOSIT(int d)
    {
        ((DataStore2)ds).temp_d = d;    /*Store d in temp_d*/
    	m.Deposit();
    	if( ((DataStore2)ds).temp_a > 0 )
    	{
    		m.AboveMinBalance();
    	}
    	else
        
    	{
    		m.BelowMinBalance();
    	}
    }
    
    public void WITHDRAW(int w)
    {
    	((DataStore2)ds).temp_w = w;    /*Store w in temp_w*/
    	m.Withdraw();
    	
    	if( ((DataStore2)ds).temp_a > 0 )
    	{
    		m.AboveMinBalance();
    	}
    	else
    	{
    		m.NoFunds();
    	}
    }
    
    public void BALANCE()
    {
    	m.Balance();
    }
    
    public void LOGIN(int y)
    {
        if( y ==((DataStore2)ds).temp_y ) /*Compre ID in DataStore2*/
            m.Login();
        else
            m.IncorrectLogin();
    }
    public void suspend()
    {
    	m.Suspend();
    }
    public void activate()
    {
    	m.Activate();
    }
    public void LOGOUT()
    {
    	m.Logout();
    }
    public void close()
    {
        m.Close();
    }
}