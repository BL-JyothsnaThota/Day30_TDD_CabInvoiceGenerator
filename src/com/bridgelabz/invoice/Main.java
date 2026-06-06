package com.bridgelabz.invoice;

public class Main {
    public static void main(String[] args) {

        InvoiceService service = new InvoiceService();

        Ride[] rides = {
            new Ride(2.0, 5, RideType.NORMAL),
            new Ride(3.0, 10, RideType.PREMIUM)
        };

        service.addRides("user1", rides);

        InvoiceSummary summary = service.getInvoiceSummary("user1");

        System.out.println("Total Rides: " + summary.totalRides);
        System.out.println("Total Fare: " + summary.totalFare);
        System.out.println("Average Fare: " + summary.avgFare);
    }
}