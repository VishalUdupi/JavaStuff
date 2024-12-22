package OopsP2;

class Customer{
    private int  customerId;
    private String customerName;
    private String emailId;
    public Customer() {
    	
    }
    public Customer(int customerId, String customerName, String emailId) {
    	this.customerId=customerId;
    	this.customerName=customerName;
    	this.emailId=emailId;
    }
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    
}

abstract class Account{
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;
    
    public Account() {
    	
    }
    public Account(int accountNumber, Customer customerObj, double balance) {
    	this.accountNumber=accountNumber;
    	this.customerObj=customerObj;
    	this.balance=balance;
    }
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomerObj() {
		return customerObj;
	}
	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract boolean withdraw(double amount);
	
}

abstract class savingAccount extends Account{
    private double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    public savingAccount() {
    	
    }
    public savingAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
    	this.accountNumber=accountNumber;
    	this.customerObj=customerObj;
    	this.balance=balance;
    	this.minimumBalance=minimumBalance;
    }
    public boolean withdraw(double amount) {
    	if(this.getBalance() > minimumBalance) {
    		double tamount = this.getBalance() - amount;
    		this.setBalance(tamount);
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

public class yzeeBank {
	public static void main(String[] args) {
		
	}

}
