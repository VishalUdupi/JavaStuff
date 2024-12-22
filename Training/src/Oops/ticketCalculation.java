package Oops;

import java.util.Scanner;

class Ticket{
	private int ticketId;
	private int price;
	private static int availableTickets;
	private int nTicket;
	public int getnTicket() {
		return nTicket;
	}
	public void setnTicket(int nTicket) {
		this.nTicket = nTicket;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if((availableTickets < 0) || (availableTickets == 0)) {
			System.out.println("Not enough tickets available!");
		}
		else {
			Ticket.availableTickets = availableTickets;
		}
	}
	public int calculateTicketCost() {
		int totalAmount = 0;
		if((Ticket.availableTickets < 0) || (Ticket.availableTickets == 0)) {
			System.out.println("Sorry, No tickets available!");
		}
		else {
			int rTickets = Ticket.getAvailableTickets() - nTicket;
			this.setAvailableTickets(rTickets);
			int price = this.getPrice();
			totalAmount += nTicket*price;
		}
		return totalAmount;
	}
}

public class ticketCalculation {
	public static void main(String[] args) {
	Ticket ticket = new Ticket();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter no. of bookings");
	int noBookings = in.nextInt();
	System.out.println("Enter no. of available tickets");
	int aTickets = in.nextInt();
	ticket.setAvailableTickets(aTickets);
	System.out.println("Enter ticket Id");
	int ticketId = in.nextInt();
	ticket.setTicketId(ticketId);
	System.out.println("Enter ticket price");
	int price = in.nextInt();
	ticket.setPrice(price);
	System.out.println("Enter no. of tickets");
	int nTickets = in.nextInt();	
	ticket.setnTicket(nTickets);
	System.out.printf("Available Tickets", aTickets);
	System.out.printf("Total Amount", ticket.calculateTicketCost());
	System.out.printf("Available Tickets after booking", ticket.getAvailableTickets());
	
	}
}