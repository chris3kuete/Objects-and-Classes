/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Date;

/**
 *
 * @author sa
 */
public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
    
    
    public Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        
    }
    public Account(int idNumber,double iniBalance){
        id=idNumber;
        balance=iniBalance;
    }
    public Account(int id,double iniBalance,double air){
      
        balance=iniBalance;
        annualInterestRate=air;
        dateCreated=new java.util.Date();
    }
    
     
    public void setId(int idNumber){
        id=idNumber;
    }
    public int getId(){
        return id; 
    }
    public void setBalance(double iniBalance){
        balance=iniBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double air){
        annualInterestRate=air;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/1200;
        
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
        
    }
    public void withdraw(double amtWithdrew){
        
       balance -=amtWithdrew ;
        
    }
    public void deposit(double amtDeposited){
        
         balance +=amtDeposited;     
    }
    
    
}
