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
public class MakeDeposit1 extends MakeDeposit{
    public void MakeDeposit(DataStore ds){
    ((DataStore1)ds).Set_Deposit();
		((DataStore1)ds).Compute_Balance_deposit();
		System.out.println("Account 1:: After Deposit Balance is $" + ((DataStore1)ds).getBalance() );
    }
}
