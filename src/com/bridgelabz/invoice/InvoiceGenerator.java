package com.bridgelabz.invoice;

public class InvoiceGenerator {

    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;

    public double calculateFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MIN;

        return Math.max(fare, MIN_FARE);
    }
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride.distance, ride.time);
        }

        return totalFare;
    }
    public InvoiceSummary calculateFareSummary(Ride[] rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }

        return new InvoiceSummary(rides.length, totalFare);
    }
    public double calculateFare(Ride ride) {

        int costPerKm = 0;
        int costPerMin = 0;
        int minFare = 0;

        if (ride.rideType == RideType.NORMAL) {
            costPerKm = 10;
            costPerMin = 1;
            minFare = 5;
        } else {
            costPerKm = 15;
            costPerMin = 2;
            minFare = 20;
        }

        double fare = ride.distance * costPerKm + ride.time * costPerMin;

        return Math.max(fare, minFare);
    }
}