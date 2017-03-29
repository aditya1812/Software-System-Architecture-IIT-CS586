/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDAEFSM;

/**
 *
 * @author 5CB4125SDX0
 */
public class S1 implements State {
    MDAEFSM m =null;
    
    //Constructor
    public S1(MDAEFSM m) 
    {
        this.m =  m;
    }
    
    public void Open()
    {

    }
    
    public void Login()
    {
    
    }
    
    public void IncorrectLogin()
    {

    }
    
    public void IncorrectPin(int max)
    {
    		
    }
    
    public void CorrectPinBelowMin()
    {

    }
    
    public void CorrectPinAboveMin()
    {

    }
    
    public void Deposit()
    {
    	
    }
    
    public void BelowMinBalance()
    {
        //Get Overdrawn State object from MDAEFSM and set the state to Overdrawn.
        m.setState(m.getOverdrawnState());
    }
    
    public void AboveMinBalance()
    {
        //Get Ready State object from MDAEFSM and set the state to Ready.
    	m.setState(m.getReadyState());
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
        //Apply the penalty of $20 over the balance.
        m.op.Penalty();
        //Get Overdrawn State object from MDAEFSM and set the state to Overdrawn. 
        m.setState(m.getOverdrawnState());
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
