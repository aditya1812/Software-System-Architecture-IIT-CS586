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
public class Overdrawn implements State{
    MDAEFSM m =null;
    
    //Constructor
    public Overdrawn(MDAEFSM m) 
    {
        this.m =  m;
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
    		
    }
    
    public void CorrectPinBelowMin()
    {

    }
    
    public void CorrectPinAboveMin()
    {

    }
    
    public void Deposit()
    {
        //Make a deposit.
    	m.op.MakeDeposit();
        //Get S1 State object from MDAEFSM and set the state to S1.
        m.setState(m.getS1State());
    }
    
    public void BelowMinBalance()
    {
    	
    }
    
    public void AboveMinBalance()
    {
    	
    }
    
    public void Logout()
    {
        //Get Idle State object from MDAEFSM and set the state to Idle.
    	m.setState(m.getIdleState());
    }
    
    public void Balance()
    {
        //Display the current account balance.
    	m.op.DisplayBalance();
    }
    
    public void Withdraw()
    {
        //Display No Funds message.
    	m.op.NoFundsMsg();
    }
    
    public void WithdrawBelowMinBalance()
    {
        
    }
    
    public void NoFunds()
    {
    	
    }
    
    public void Lock()
    {
        //Get Locked State object from MDAEFSM and set the state to Locked.
    	m.setState(m.getLockedState());
    }
    
    public void IncorrectLock()
    {
        //Display incorrect Unlock Message.
    	m.op.IncorrectLockMsg();
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
