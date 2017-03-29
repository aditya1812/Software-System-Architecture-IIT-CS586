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
public class MakeWithdraw2 extends MakeWithdraw {
    public void MakeWithdraw(DataStore ds)
	{
		((DataStore2)ds).Set_Withdraw();
		((DataStore2)ds).Compute_Balance_withdraw();
		System.out.println("Account 2:: After Withdraw Balance is $" + ((DataStore2)ds).getBalance() );
	}
}

