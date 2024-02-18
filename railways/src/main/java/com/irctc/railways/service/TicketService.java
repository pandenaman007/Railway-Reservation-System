package com.irctc.railways.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irctc.railways.model.Ticket;

public interface TicketService {
	public  Ticket createTicket(Ticket ticket);
	public Ticket getTicketByPnrNo(String pnrNo);
	public List<Ticket> getAllTickets();
	public  Ticket save(Ticket ticket);
	public boolean deletebyPnrNo(Ticket ticket);
	
}
