package com.ticket;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


/**
 * @author Priyank
 * Name: Priyank Shah
 * Student #: 301097375
 * Submission Date: Nov 13, 2020
 */

@Service
public class TicketService {
	Map<Integer, Ticket> mapTicket = new HashMap<>();

    public void addTicket(Ticket ticket) throws Exception {
        if(mapTicket.containsKey(ticket.getTicketId())) {
            throw new Exception("Ticket already exists");
        }
        else {
            mapTicket.put(ticket.getTicketId(), ticket);
        }
    }

    public Iterable<Ticket> getTickets(){
        return mapTicket.values();
    }

    public Ticket getTickets(int ticketId) throws Exception {

        if(mapTicket.containsKey(ticketId)) {
            return mapTicket.get(ticketId);
        }
        else {
            throw new Exception("Ticket Id not found");
        }
    }

    public void updateTicket(Ticket ticket) throws Exception {
        if(mapTicket.containsKey(ticket.getTicketId())) {
            mapTicket.put(ticket.getTicketId(), ticket);
        }
        else {
            throw new Exception("Ticket Id not found");
        }
    }


    public void deleteTicket(int ticketId) throws Exception {
        if(mapTicket.containsKey(ticketId)) {
            mapTicket.remove(ticketId);
        }
        else {
            throw new Exception("Ticket Id not found");
        }
    }
}
