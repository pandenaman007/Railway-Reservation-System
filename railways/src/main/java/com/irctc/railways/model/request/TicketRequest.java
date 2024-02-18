package com.irctc.railways.model.request;

import java.util.Date;

public class TicketRequest {
	private String from;
	private String to;
	private Date journeyDate;
	private String journeyQuota;

	public TicketRequest() {
		super();
	}

	public TicketRequest(String from, String to, Date journeyDate, String journeyQuota) {
		super();
		this.from = from;
		this.to = to;
		this.journeyDate = journeyDate;
		this.journeyQuota = journeyQuota;
	}

	public String getJourneyQuota() {
		return journeyQuota;
	}

	public void setJourneyQuota(String journeyQuota) {
		this.journeyQuota = journeyQuota;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

}
