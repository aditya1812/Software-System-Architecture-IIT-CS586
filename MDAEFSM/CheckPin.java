/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDAEFSM;
import OP.*;

/**
 *
 * @author 5CB4125SDX0
 */
public class CheckPin implements State{
    MDAEFSM m = null;
    
    //Constructor
    public CheckPin(MDAEFSM m) 
    {
        this.m = m;
    }
    
    public void Open()
    {

    }
    
    public void Login()
    {
    
    }
    
    public void IncorrectLogin(){
        
    }
    
    public void IncorrectPin(int max)
    {
    	if( m.attempts < max )
    	{
            m.attempts++;
            //     Display incorrect pin message. 
            m.op.IncorrectPinMsg();
    	}
    	else if( m.attempts == max )
    	{
            //Display incorrect pin message. 
            m.op.IncorrectPinMsg();
            //Display too many attempts message.    
            m.op.TooManyAttemptsMsg();
            //Get idle state object from MDAEFSM and set the state to idle     
            m.setState(m.getIdleState());
    	}	
    }
    
    public void CorrectPinBelowMin()
    {
        //Display account menu.
        m.op.DisplayMenu();
        //Get Overdrawn State object from MDAEFSM and set the state to Overdrawn.
    	m.setState(m.getOverdrawnState());
    }
    
    public void CorrectPinAboveMin()
    {
        //Display account menu.
         m.op.DisplayMenu();
        //Get Ready State object from MDAEFSM and set the state to Ready.
         m.setState(m.getReadyState());
    }
    
    public void Deposit()
    {
    	
    }
    
    public void BelowMinBalance()
    {
    	
    }
    
    public void AboveMinBalance()
    {
    	
    }
    
    public void Logout()
    {
    	
    }
    
    public void Balance()
    {
    	
    }
    
    public void Withdraw()
    {
    	
    }
    
    public void WithdrawBelowMinBalance()
    {
        
    }
    
    public void NoFunds()
    {
    	
    }
    
    public void Lock()
    {
    	
    }
    
    public void IncorrectLock()
    {
    	
    }
    public void Unlock()
    {
    	
    }
    
    public void IncorrectUnlock()
    {
    	
    }
    
    public void Suspend()
    {
    	
    }
    
    public void Activate()
    {
    	
    }
    
    public void Close()
    {
    	
    }
}
