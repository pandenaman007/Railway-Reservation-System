package com.irctc.railways.model.response;

public class PassengerResponse {

    private String pnrNo;
    private String passengerName;
    public PassengerResponse(){}
    public PassengerResponse(String id, String passengerName) {
        this.pnrNo = id;
        this.passengerName = passengerName;
    }

    public String getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String custName) {
        this.passengerName = custName;
    }
}
