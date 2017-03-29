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
public class Idle implements State {
    MDAEFSM m =null;
    
    public Idle(MDAEFSM m) 
    {
        this.m =  m;
    }
    
    public void Open()
    {

    }
    
    public void Login()
    {
    	m.attempts = 0;
    	//m.op.StoreData();
    	m.op.PromptForPin();
    	m.setState(m.getCheckPinState());   /*Get CheckPin State object from MDAEFSM and set the state to CheckPin.*/
    }
    
    public void IncorrectLogin(){
        m.op.IncorrectIDMsg();  
        //Display incorrect id message.
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
