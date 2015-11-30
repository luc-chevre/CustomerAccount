package business;

public class Account {

	private Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
        public Account(Customer customer, String number, String name) {
            this.customer = customer;
            this.number = number;
            this.name = name;
        }
        
        public Account(Customer customer, String number, String name, double rate) {
            this.customer = customer;
            this.number = number;
            this.name = name;
            this.rate = rate;
        }
        
	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {

            this.balance += amount;
	}

	/**
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
            if(this.balance - amount < 0)
                System.out.println("Error");
            else
                this.balance -= amount;
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public static void transfer(double amount, Account source, Account target) {
            source.debit(amount);
            target.credit(amount);
	}

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
        

}