/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDAEFSM;
import AbstractFactory.*;

/**
 *
 * @author 5CB4125SDX0
 */
public class Start implements State{
    MDAEFSM m =null;
    
    //Constructor
    public Start(MDAEFSM m) 
    {
        this.m =  m;
    }  
    
    //Get idle state object from MDAEFSM and set the state to idle.
    public void Open()
    {
    	m.op.StoreData();
        m.setState(m.getIdleState());
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
