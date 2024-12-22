package exceptionHandling;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidIDexception extends Exception{
	public InvalidIDexception(String message) {
		super(message);
	}
	}

class checkerForID{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public checkerForID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public checkerForID(String id) {
		super();
		this.id = id;
	}
	
	public boolean checkId(String id)throws InvalidIDexception{
		boolean flag = false;
		char[] ch1 = id.toCharArray();
		if(ch1.length < 8) {
			throw new InvalidIDexception("the total length should be 8 charcters");
		}
		for(int i =0; i<8; i++) {
			if(Character.isUpperCase(ch1[0]) &&Character.isUpperCase(ch1[0])) {
				Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(id.substring(2, 3));
				boolean check = m.find();
				if(check) {
					
				} else {
					throw new InvalidIDexception("Invalid Id");
				}
				Pattern q = Pattern.compile("[0-9]");
				Matcher m2 = q.matcher(id.substring(2, 3));
				boolean check1 = m.find();
				if(check1) {
					flag = true;
				} else {
					throw new InvalidIDexception("Invalid Id");
				}
			}
		}
		return flag;
	}
}

public class idChecker {
	public static void main(String[] args) throws InvalidIDexception {
		Scanner in = new Scanner(System.in);
		String id = in.nextLine();
		checkerForID c = new checkerForID();
		if(c.checkId(id)) {
			System.out.println("Valid Id");
		}
		else {
			throw new InvalidIDexception("Invalid Id");
		}
	}
}
