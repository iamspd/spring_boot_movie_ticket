package com.ticket;

import java.util.Date;

/**
 * @author Priyank
 * Name: Priyank Shah
 * Student #: 301097375
 * Submission Date: Nov 13, 2020
 */

public class Ticket {
	private int ticketId, custId;
	private String movieName, venue;
	private double amountPaid;
	private int numberOfTicket;
	private Date dateTime;
	
	
	
	public Ticket(int ticketId, int custId, String movieName, String venue, double amountPaid, int numberOfTicket,
			Date dateTime) {
		super();
		this.ticketId = ticketId;
		this.custId = custId;
		this.movieName = movieName;
		this.venue = venue;
		this.amountPaid = amountPaid;
		this.numberOfTicket = numberOfTicket;
		this.dateTime = dateTime;
	}


	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getVenue() {
		return venue;
	}


	public void setVenue(String venue) {
		this.venue = venue;
	}


	public double getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}


	public int getNumberOfTicket() {
		return numberOfTicket;
	}


	public void setNumberOfTicket(int numberOfTicket) {
		this.numberOfTicket = numberOfTicket;
	}


	public Date getDateTime() {
		return dateTime;
	}


	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	

}
