package com.irctc.railways.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.railways.model.Ticket;
import com.irctc.railways.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/createticket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}

	@PostMapping("/ticketinfo")
	public Ticket createTicket() {
		return ticketService.getTicketByPnrNo("ABC1234");
	}

	@PostMapping("/bookticket")
	public Ticket bookTicket(@RequestBody Ticket ticket) {
		return ticketService.getTicketByPnrNo("ASD123");
	}

}
