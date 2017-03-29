/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OP;
import AbstractFactory.*;
import DataStore.*;
import Strategy.*;

/**
 *
 * @author 5CB4125SDX0
 */
public class Output {
    AF f =null;
    DataStore ds = null;
	
        //Constructor
	public Output(AF f,DataStore ds) 
	{
        this.f = f;
        this.ds = ds;
    }

	
	public void IncorrectPinMsg()
	{
                //Create factory object and call the IncorrectPinMsg strategy class function IncorrectPinMsg()
		System.out.println("\n OUTPUT:: Action Incorrect_Pin_Msg");
		IncorrectPinMsg incorrect_pin = f.CreateIncorrectPinMsg();
		incorrect_pin.IncorrectPinMsg();
	}
        
        public void IncorrectIDMsg()
	{       
                //Create factory object and call the IncorrectIDMsg strategy class function IncorrectIDMsg()
		System.out.println("\n OUTPUT:: Action Incorrect_ID_Msg");
		IncorrectIDMsg incorrect_ID = f.CreateIncorrectIDMsg();
		incorrect_ID.IncorrectIDMsg();
	}
	
	public void TooManyAttemptsMsg()
	{
                /*Create factory object and call the TooManyAttemptsMsg strategy classfunction TooManyAttemptsMsg()*/
		System.out.println("\n OUTPUT:: Action Too_Many_Attempts_Msg");
		TooManyAttemptsMsg too_many_attempts = f.CreateTooManyAttemptsMsg();
		too_many_attempts.TooManyAttemptsMsg();
	}
	
	public void DisplayMenu()
	{
                //Create factory object and call the DisplayMenu strategy class function DisplayMenu()
		System.out.println("\n OUTPUT:: Action Display_Menu");
		DisplayMenu disp_menu = f.CreateDisplayMenu();
		disp_menu.DisplayMenu();
	}
	
	public void StoreData()
	{       
                //Create factory object and call the StoreData strategy function StoreData()
		System.out.println("\n OUTPUT:: Action Store_Data");
		StoreData store_data = f.CreateStoreData();
		store_data.StoreData(ds);
	}
	
	public void PromptForPin()
	{
                //Create factory object and call the PromptForPin strategy class function PromptForPin()
		System.out.println("\n OUTPUT:: Action Prompt_For_Pin ");
		PromptForPin Prompt_For_Pin = f.CreatePromptForPin();
		Prompt_For_Pin.PromptForPIN();
	}
	
	public void DisplayBalance()
	{
                //Create factory object and call the DisplayBalance strategy class function DisplayBalance()
		System.out.println("\n OUTPUT:: Action Display_Balance ");
		DisplayBalance disp_bal = f.CreateDisplayBalance();
		disp_bal.DisplayBalance(ds);
	}
	
	public void MakeDeposit()
	{
                //Create factory object and call the MakeDeposit strategy class function MakeDeposit()
		System.out.println("\n OUTPUT:: Action Make_Deposit ");
		MakeDeposit make_deposit = f.CreateMakeDeposit();
		make_deposit.MakeDeposit(ds);
	}
	
	public void MakeWithdraw()
	{
                //Create factory object and call the MakeWithdraw strategy class function MakeWithdraw()
		System.out.println("\n OUTPUT:: Action Make_Withdraw  ");
		MakeWithdraw make_withdraw = f.CreateMakeWithdraw();
		make_withdraw.MakeWithdraw(ds);
	}
	
	public void Penalty()
	{
                //Create factory object and call the Penalty strategy class function Penalty()
		System.out.println("\n OUTPUT:: Action Penalty  ");
		Penalty penalty = f.CreatePenalty();
		penalty.Penalty(ds);
	}
        
        public void IncorrectLockMsg()
	{
                //Create factory object and call the IncorrecLockMsg strategy class function IncorrectLockMsg()
		System.out.println("\n OUTPUT:: Action Incorrect_Lock_Msg");
		IncorrectLockMsg incorrect_lock = f.CreateIncorrectLockMsg();
		incorrect_lock.IncorrectLockMsg();
	}
        
        public void IncorrectUnlockMsg()
	{
                //Create factory object and call the IncorrectUnlockMsg strategy class function IncorrectUnockMsg()
		System.out.println("\n OUTPUT:: Action Incorrect_Unlock_Msg");
		IncorrectUnlockMsg incorrect_unlock = f.CreateIncorrectUnlockMsg();
		incorrect_unlock.IncorrectUnlockMsg();
	}
        
        public void NoFundsMsg()
	{
                //Create factory object and call the NoFundsMsg strategy class function NoFundsMsg()
		System.out.println("\n OUTPUT:: Action No_Funds_Msg");
		NoFundsMsg no_funds = f.CreateNoFundsMsg();
		no_funds.NoFundsMsg();
	} 
}
