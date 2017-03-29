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
public class Penalty {
    public void Penalty(DataStore ds)
	{
		((DataStore1)ds).takePenalty();
		System.out.println("Account 1:: There is a minimum balance requirement of $500. Penalty of $20 is applied.");
		System.out.println("Account 1:: After taking Penalty, Balance is $" + ((DataStore1)ds).balance );
	}
    
}
