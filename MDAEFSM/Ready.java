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
public class Ready implements State{
    MDAEFSM m = null;
    
    //Constructor
    public Ready(MDAEFSM m) 
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
    }
    
    public void BelowMinBalance()
    {
    	
    }
    
    public void AboveMinBalance()
    {
    	
    }
    
    public void Logout()
    {
        //Get Idle state object from MDAEFSM and set the state to Idle.
    	m.setState(m.getIdleState());
    }
    
    public void Balance()
    {   
        //Display Balance.
    	m.op.DisplayBalance();
    }
    
    public void Withdraw()
    {
        //Make withdrawal. 
    	m.op.MakeWithdraw();
        //Get S1 state object from MDAEFSM and set the state to S1.
        m.setState(m.getS1State());
    }
    
    public void WithdrawBelowMinBalance()
    {
        
    }
    
    public void NoFunds()
    {
        //Display No Funds message.
    	m.op.NoFundsMsg();
    }
    
    public void Lock()
    {   
        //Get Locked state object from MDAEFSM and set the state to Locked.
    	m.setState(m.getLockedState());
    }
    
    public void IncorrectLock()
    {
        //Display incorrect lock message.
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
        //Get Suspended state object from MDAEFSM and set the state to Suspended.
    	m.setState(m.getSuspendedState());
    }
    
    public void Activate()
    {
    	
    }
    
    public void Close()
    {
    	
    }
}
