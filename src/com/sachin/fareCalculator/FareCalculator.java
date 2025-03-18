package com.sachin.fareCalculator;

// Functional Interface for Fare Calculation
@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, double ratePerKm);
}

