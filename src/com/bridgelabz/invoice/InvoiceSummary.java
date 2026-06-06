package com.bridgelabz.invoice;

public class InvoiceSummary {
    int totalRides;
    double totalFare;
    double avgFare;

    public InvoiceSummary(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgFare = totalFare / totalRides;
    }
}