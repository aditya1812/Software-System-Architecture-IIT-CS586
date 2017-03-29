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
public class Locked implements State {
    MDAEFSM m =null;
    
    //Constructor
    public Locked(MDAEFSM m) 
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
        //Get S1 State object from MDAEFSM and set the state to S1.
    	m.setState(m.getS1State());
    }
    
    public void IncorrectUnlock()
    {
        //Display Incorrect Unlock message.
    	m.op.IncorrectUnlockMsg();
        
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
