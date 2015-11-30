package business;


import java.util.*;

public class Customer {

    private Collection<Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    public Customer(int number, String firstName, String lastName) {
        this.accounts = accounts;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<Account>();
    }

    public Account getAccountByNumber(String number) {
        for (Account compte : accounts) {
            if (compte.getNumber() == number) {
                return compte;
            }   
        }
        return null;
    }
        /**
         *
         * @param number
         * @param name
         * @param rate
         */
    public void addAccount(String number, String name, double rate) {
        Account compte = new Account(this, number, name);
        compte.setRate(rate);
        accounts.add(compte);
    }
    
    public String getLastname() {
        return lastName;
    }

}
