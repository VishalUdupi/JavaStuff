package practiceQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TransactionParty{
	String seller;
    String buyer;
	public TransactionParty(String seller, String buyer) {
		super();
		this.seller = seller;
		this.buyer = buyer;
	}
	public TransactionParty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
    
}

class Receipt extends TransactionParty{
	private TransactionParty transactionParty;
    String productsQR;
	public Receipt(TransactionParty transactionParty, String productsQR) {
		super();
		this.transactionParty = transactionParty;
		this.productsQR = productsQR;
	}
	public Receipt() {
		// TODO Auto-generated constructor stub
	}
	public TransactionParty getTransactionParty() {
		return transactionParty;
	}
	public void setTransactionParty(TransactionParty transactionParty) {
		this.transactionParty = transactionParty;
	}
	public String getProductsQR() {
		return productsQR;
	}
	public void setProductsQR(String productsQR) {
		this.productsQR = productsQR;
	}
    
}

class GenerateReceipt{
	public int verifyParty(Receipt r) {
//		Receipt r1 = new Receipt();
		Pattern p = Pattern.compile("[a-zA-Z][\\d][-]{1}[']{1}[a-zA-Z]");
		Matcher m1 = p.matcher(r.getBuyer());
		Matcher m2 = p.matcher(r.getSeller());
		int flag =0;
		if(m1.find() && m2.find()) {
			flag = 2;
		}
		else if(m1.find() || m2.find()) {
			flag = 1;
		}
		return flag;
		
	}
	public String calcGST(Receipt r) {
//		Receipt r2 = new Receipt();
		String QR = r.getProductsQR();
		String[] arr = QR.split("\\W"); //non word based splitting.
		List<String> listOfRates = Arrays.asList(arr);
		List<Integer> intList = new ArrayList<>();
		for(String s : listOfRates) intList.add(Integer.valueOf(s));
		Integer[] a1 = new Integer[intList.size()];
		a1 = intList.toArray(a1);
		double GST = (a1[0] * a1[1] + a1[2] * a1[3] + a1[4] * a1[5]) * 0.12;
		String a = String.valueOf(GST);
		return a;
		
	}
}

public class ques1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String QR = in.nextLine();
		String buyer = in.nextLine();
		String seller = in.nextLine();
		TransactionParty t = new TransactionParty();
		t.setBuyer(buyer);
		t.setSeller(seller);
		Receipt r = new Receipt();
		r.setProductsQR(QR);
		GenerateReceipt gr = new GenerateReceipt();
		System.out.println(gr.calcGST(r));
		System.out.println(gr.verifyParty(r));
	} 
}
