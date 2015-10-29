/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author luc.chevre
 */
public class Bank {

    private int number;
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new ArrayList();
        this.accounts = new ArrayList();
    }

    public Account getAccountByNumber(String number) {
        for (Account acc : this.accounts) {
            if (acc.getNumber() == number) {
                return acc;
            }
        }
        return null;
    }

    public Customer getCustomerByNumber(int number) {
        for (Customer cus : this.customers) {
            if (cus.getNumber()== number) {
                return cus;
            }
        }
        return null;
    }
    
    public void addCustomer(int number, String fn, String ln){
        Customer cus = new Customer(number,fn,ln);
        this.customers.add(cus);
    }
    
    public void addAccount(String number,String name, double rate, Customer customer){
        Account acc = new Account(customer, number, name);
        customer.getAccounts().add(acc);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

}
