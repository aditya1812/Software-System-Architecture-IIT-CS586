/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;
import DataStore.*;

public class StoreData1 extends StoreData
{
	public void StoreData(DataStore ds)
	{       
                //Store Pin, ID and Balance into the DataStore1.
		((DataStore1)ds).setBalance();
                ((DataStore1)ds).setPIN();
                ((DataStore1)ds).setID();
                System.out.println("Account 1: PIN:"+((DataStore1)ds).getPIN());
                System.out.println("Account 1: ID:"+((DataStore1)ds).getID());
                System.out.println("Account 1: Balance:"+((DataStore1)ds).getBalance());
	}
}
