package com.irctc.railways.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.railways.model.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long >{
	
}
