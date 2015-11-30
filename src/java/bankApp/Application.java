/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankApp;

import business.Bank;
import business.Customer;

/**
 *
 * @author yannick.galvanetto
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bank bank = new Bank(1, "BCJ");
        bank.addCustomer(1, "francois", "gatherat");
        bank.addCustomer(2,"yannick", "galvanetto");
        
        bank.addAccount("123", "epargne", 0.1, bank.getCustomerByNumber(0));
        bank.addAccount("456", "jeune", 0.2, bank.getCustomerByNumber(1));
        bank.addAccount("789", "jeune", 0.2, bank.getCustomerByNumber(1));
        
        
        bank.getAccountByNumber("456").credit(150);
        bank.getAccountByNumber("456").debit(100);
        bank.getAccountByNumber("456").debit(100);
        bank.getAccountByNumber("123").credit(200);
        
        System.out.println(bank.getAccountByNumber("456").getBalance());
        System.out.println(bank.getAccountByNumber("123").getCustomer().getLastname());
    }
    
}
