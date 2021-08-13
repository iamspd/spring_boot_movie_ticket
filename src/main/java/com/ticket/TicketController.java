package com.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Priyank
 * Name: Priyank Shah
 * Student #: 301097375
 * Submission Date: Nov 13, 2020
 */

@RestController
public class TicketController {

	@Autowired
	TicketService ticketService;
	
	@ResponseBody
	@RequestMapping("/t")
	public String home()
	{
		return "Creat a Ticket Web service";
	}

 @RequestMapping(value = "/ticket/{ticketId}", method = RequestMethod.GET)
 Ticket getTicket(@PathVariable("ticketId") int ticketId) throws Exception {
     return ticketService.getTickets(ticketId);
 }

 @RequestMapping(value = "/tickets", method = RequestMethod.GET)
 Iterable<Ticket> getEmployees() {
     return ticketService.getTickets();
 }

 @RequestMapping(value = "/ticket", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
 @ResponseStatus(value = HttpStatus.OK)
 void addticket(@RequestBody Ticket ticket) throws Exception {
     ticketService.addTicket(ticket);
 }

 @RequestMapping(value = "/ticket/{ticketId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
 @ResponseStatus(value = HttpStatus.OK)
 void updateticket(@PathVariable("ticketId") int ticketId, @RequestBody Ticket ticket) throws Exception {
     ticket.setTicketId(ticketId);
     ticketService.updateTicket(ticket);
 }

 @RequestMapping(value = "/ticket/{ticketId}", method = RequestMethod.DELETE)
 @ResponseStatus(value = HttpStatus.OK)
 void deleteticket(@PathVariable("ticketId") int ticketId) throws Exception {
     ticketService.deleteTicket(ticketId);
 }

}
