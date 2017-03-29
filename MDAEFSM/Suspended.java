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
public class Suspended implements State{
    MDAEFSM m =null;
    
    
    //Constructor
    public Suspended(MDAEFSM m) 
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
    	
    }
    
    public void AboveMinBalance()
    {
    	
    }
    
    public void Logout()
    {
    	
    }
   
    public void Balance()
    {
        //Display the current account balance.
    	m.op.DisplayBalance();
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
    
    //
    public void Activate()
    {
        //Get Ready State object from MDAEFSM and set the state to Ready.
    	m.setState(m.getReadyState());
    }
    
    public void Close()
    {
        //
    	System.out.println("Account 2 Terminated...!");
        System.exit(0);
    }
    
}
