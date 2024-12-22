package Oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account{
	private int accountId;
	private String accountType;
	private int balance;
	public boolean withdraw(int amount) {
    	if(balance<amount) {
    		System.out.println("Less Balance Maintained");
    		return false;
    	}
    	else {
    		balance-=amount;
    		System.out.println("Balance after amount withdrawn: "+balance);
    		return true;
    	}
    }
    public void setAccountId(int accountId) {
    	this.accountId=accountId;
    }
    public void setBalance(int balance) {
    	this.balance=balance;
    }
    public boolean getAccountId(int accountid) {
    	return this.accountId==accountid;
    }
    public int getBalance() {
    	return this.balance;
    }
   public void setType(String name) {
	   this.accountType=name;
   }
   public String getType() {
	   return this.accountType;
   }

}

public class hrInterview {
	public static List<Account> list;
	public static void main(String[] args) {
		list=new ArrayList<>();
		Scanner in = new Scanner(System.in);
		Account ac1=new Account();
		System.out.println("Enter the Account Id");
		int id = in.nextInt();
		ac1.setAccountId(id);
		System.out.println("Enter the Account Balance");
		int bal = in.nextInt();
		ac1.setBalance(bal);
		System.out.println("Enter the Account Type");
		String type = in.next();
		ac1.setType(type);
		list.add(ac1);
		Account ac2=new Account();
		System.out.println("Enter the Account Id");
		int id1 = in.nextInt();
		ac2.setAccountId(id1);
		System.out.println("Enter the Account Balance");
		int bal1 = in.nextInt();
		ac2.setBalance(bal1);
		System.out.println("Enter the Account Type");
		String type1 = in.next();
		ac2.setType(type1);
		list.add(ac2);
		Account ac3=new Account();
		System.out.println("Enter the Account Id");
		int id2 = in.nextInt();
		ac3.setAccountId(id2);
		System.out.println("Enter the Account Balance");
		int bal2 = in.nextInt();
		ac3.setBalance(bal2);
		System.out.println("Enter the Account Type");
		String type2 = in.next();
		ac3.setType(type2);
		list.add(ac3);
	
		Account res=getAccountDetails(125);
		if(res!=null)System.out.println("Account Found.\nAccount Type: "+res.getType()+"\nAccount Balance: "+res.getBalance());
		
	}
		public static Account getAccountDetails(int accountId) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getAccountId(accountId))return list.get(i);
			}
		
				System.out.println("No Account found");
				return null;
			}
		public static int getWithdrawAmount(Account ac,int amount) {
			return ac.getBalance()-amount;
		}
}
