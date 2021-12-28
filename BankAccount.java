/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Account acc = new Account(1122,20000,0.045);
        java.util.Date dateCreated = acc.getDateCreated();
        
        acc.withdraw(2500);
        acc.withdraw(4000);
        acc.deposit(3000);
        
        
        
        System.out.println("the balance is "+ acc.getBalance());
        System.out.println("the monthly interest is "+ acc.getMonthlyInterest());
        System.out.println("the date created is "+ acc.getDateCreated());
        
    }
    
}
