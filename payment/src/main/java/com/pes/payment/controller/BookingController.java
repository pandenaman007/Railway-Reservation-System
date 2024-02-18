package com.pes.payment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pes.payment.model.request.PaymentRequest;

@RestController
@RequestMapping("/booking")
public class BookingController {
	private  final String NEWLINE = System.getProperty("line.separator");
	@PostMapping("/bookticket")
	public String createTicket(@RequestBody PaymentRequest payment) {
		StringBuilder str= new StringBuilder();
		str.append("Booking Confirmed");
		str.append(NEWLINE);
		str.append(payment.getFrom());
		str.append(NEWLINE);
		str.append(payment.getTo());
		str.append(NEWLINE);
		str.append(payment.getJourneyDate());
		str.append(NEWLINE);
		str.append(payment.getJourneyQuota());
		return str.toString();
	}

}
