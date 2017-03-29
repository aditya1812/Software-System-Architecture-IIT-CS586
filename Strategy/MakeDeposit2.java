/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;
import DataStore.*;

/**
 *
 * @author 5CB4125SDX0
 */
public class MakeDeposit2 extends MakeDeposit{
    public void MakeDeposit(DataStore ds){
    ((DataStore2)ds).Set_Deposit();
		((DataStore2)ds).Compute_Balance_deposit();
		System.out.println("Account 2:: After Deposit Balance is $" + ((DataStore2)ds).getBalance() );
    }
}
