package com.bridgelabz.invoice;

import java.util.HashMap;

public class RideRepository {

    private HashMap<String, Ride[]> userRides = new HashMap<>();

    public void addRides(String userId, Ride[] rides) {
        userRides.put(userId, rides);
    }

    public Ride[] getRides(String userId) {
        return userRides.get(userId);
    }
}