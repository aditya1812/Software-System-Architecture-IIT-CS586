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
public class MakeWithdraw1 extends MakeWithdraw {
    public void MakeWithdraw(DataStore ds)
	{
		((DataStore1)ds).Set_Withdraw();
		((DataStore1)ds).Compute_Balance_withdraw();
		System.out.println("Account 1:: After Withdraw Balance is $" + ((DataStore1)ds).getBalance() );
	}
}
