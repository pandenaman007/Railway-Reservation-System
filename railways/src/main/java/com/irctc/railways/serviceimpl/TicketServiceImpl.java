package com.irctc.railways.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.railways.model.Ticket;
import com.irctc.railways.repository.TicketRepository;
import com.irctc.railways.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepository ticketRepository;
		
	@Override
	public Ticket getTicketByPnrNo(String pnrNo) {
		// Ticket ticket=ticketRepository.getTicketByPnrNo(pnrNo);
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		return null;
	}

	@Override
	public Ticket save(Ticket ticket) {
		return null;
	}

	@Override
	public boolean deletebyPnrNo(Ticket ticket) {
		return false;
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

}
