/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import DataStore.*;

public class StoreData2 extends StoreData
{
	public void StoreData(DataStore ds)
	{
                //Store Pin, ID and Balance into the DataStore2.
		((DataStore2)ds).setBalance();
                ((DataStore2)ds).setPIN();
                ((DataStore2)ds).setID();
                System.out.println("Account 2: PIN:"+((DataStore2)ds).getPIN());
                System.out.println("Account 2: ID:"+((DataStore2)ds).getID());
                System.out.println("Account 2: Balance:"+((DataStore2)ds).getBalance());
	}
}