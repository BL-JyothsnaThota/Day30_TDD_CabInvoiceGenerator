package com.bridgelabz.invoice;

public class Ride {
    double distance;
    int time;
    RideType rideType;

    public Ride(double distance, int time, RideType rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}