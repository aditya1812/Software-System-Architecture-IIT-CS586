/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDAEFSM;
import AbstractFactory.*;
import OP.*;

/**
 *
 * @author 5CB4125SDX0
 */
public class MDAEFSM {
    State Start = new Start(this);
    State Idle = new Idle(this);
    State CheckPin = new CheckPin(this);
    State Ready = new Ready(this);
    State Overdrawn = new Overdrawn(this);
    State S1 = new S1(this);
    State Locked = new Locked(this);
    State Suspended = new Suspended(this);
    
    State MDAState = null;

    //State List[8] ;
	public int attempts;
	
	AF f =null;
	Output op = null;
    
    /*It is the constructor. It sets the current state of the Account to Start and set the value of Attempts to 0.*/
    public MDAEFSM(AF f,Output op) {
        MDAState = Start;
        attempts = 0;
        this.f = f;
        this.op = op;
    }   
    //Call State function Open()
    public void Open()
    {
    	MDAState.Open();
    	attempts = 0;
    	printCurrentState();
    }
    
    //CALL STATE FUNCTION LOGIN()
    public void Login()
    {
        MDAState.Login();
        attempts=0;
        printCurrentState();
    }
    
    //Call State function IncorrectLogin()
    public void IncorrectLogin(){
        MDAState.IncorrectLogin();
        printCurrentState();
    }
    
    //Call State function IncorrectPin()
    public void IncorrectPin(int max)
    {
    	MDAState.IncorrectPin(max);
    	printCurrentState();
    }
    
    //Call State function CorrectPinBelowMin()
    public void CorrectPinBelowMin()
    {
    	MDAState.CorrectPinBelowMin();
    	printCurrentState();
    }
    
    //Call State function CorrectPinAboveMin()
    public void CorrectPinAboveMin()
    {
    	MDAState.CorrectPinAboveMin();
    	printCurrentState();
    }
    
    //Call State function Deposit()
    public void Deposit()
    {
    	MDAState.Deposit();
    	printCurrentState();
    }
    
    //Call State function Deposit()
    public void BelowMinBalance()
    {
    	MDAState.BelowMinBalance();
    	printCurrentState();
    }
    
    //Call State function AboveMinBalance()
    public void AboveMinBalance()
    {
    	MDAState.AboveMinBalance();
    	printCurrentState();
    }
    
    //Call State function Logout()
    public void Logout()
    {
    	MDAState.Logout();
    	printCurrentState();
    }
    
    //Call State function Balance()
    public void Balance()
    {
    	MDAState.Balance();
    	printCurrentState();
    }
    
    //Call State function Withdraw()
    public void Withdraw()
    {
    	MDAState.Withdraw();
    	printCurrentState();
    }
    
    //Call State function WithdraBelowMinBalance()
    public void WithdrawBelowMinBalance()
    {
    	MDAState.WithdrawBelowMinBalance();
    	printCurrentState();
    }
    
    //Call State function NoFunds()
    public void NoFunds()
    {
    	MDAState.NoFunds();
    	printCurrentState();
    }
    
    //Call State function Lock()
    public void Lock()
    {
    	MDAState.Lock();
    	printCurrentState();
    }
    
    //Call State function IncorrectLock()
    public void IncorrectLock()
    {
    	MDAState.IncorrectLock();
    	printCurrentState();
    }
    
    //Call State function Unlock()
    public void Unlock()
    {
    	MDAState.Unlock();
    	printCurrentState();
    }
    
    //Call State function IncorrectUnlock()
    public void IncorrectUnlock()
    {
    	MDAState.IncorrectUnlock();
    	printCurrentState();
    }
    
    //Call State function Suspend()
    public void Suspend()
    {
    	MDAState.Suspend();
    	printCurrentState();
    }
    
    //Call State function Activate()
    public void Activate()
    {
    	MDAState.Activate();
    	printCurrentState();
    }
    
    //Call State function Close()
    public void Close()
    {
    	MDAState.Close();
        printCurrentState();
    	
    }
    
    //Set MDAFSM state to current state
    public void setState(State efsmState) 
    {
        this.MDAState = efsmState;
    }
    
    //Return Account State
    public State getAccountState() {
        return MDAState;
    }
    
    //Return object of Start state
    public State getStartState() {
        return Start;
    }
    
    //Return object of Idle state
    public State getIdleState() {
        return Idle;
    }
    
    //Return object of CheckPin State
    public State getCheckPinState() {
        return CheckPin;
    }
    
    //Return object of Ready State
    public State getReadyState() {
        return Ready;
    }
    
    //Return object of Locked State
    public State getLockedState() {
        return Locked;
    }
    
    //Return object of Overdrawn State
    public State getOverdrawnState() {
        return Overdrawn;
    }
    
    //Return S1 State
    public State getS1State() {
        return S1;
    }
    
    //Return Suspended State
    public State getSuspendedState() {
        return Suspended;
    }
    
    //Print Current State
    public void printCurrentState(){
    	System.out.println("Current Account State : "+ MDAState.getClass().getName()+"---");
    }
  
    
}
