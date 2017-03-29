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
public class DisplayBalance2 extends DisplayBalance {
    public void DisplayBalance(DataStore ds)
	{
		System.out.println("Account 2:: Balance is $" + ((DataStore2)ds).getBalance() );
	}
}