package com.sachin.service;

import com.sachin.fareCalculator.FareCalculator;
import com.sachin.modal.Cab;

import com.sachin.modal.Ride;

import java.util.*;

import java.util.stream.Collectors;

    public class BookingCabService {
        private List<Cab> cabs = new ArrayList<>();
        private List<Ride> rides = new ArrayList<>();

        public BookingCabService() {
            // Adding some cabs
            cabs.add(new Cab("C001", "Amit", "Sedan", true, "9876543210"));
            cabs.add(new Cab("C002", "Rohit", "SUV", false, null)); // Not available
            cabs.add(new Cab("C003", "Neha", "Hatchback", true, "9998887776"));
        }

        // Lambda Expression for Fare Calculation
        FareCalculator fareCalculator = (distance, ratePerKm) -> distance * ratePerKm;

        // Booking a Ride (Fixed)
        public Optional<Ride> bookRide(String userId, double distance) {
            Optional<Cab> availableCab = cabs.stream()
                    .filter(Cab::isAvailable)
                    .findFirst(); // Get first available cab

            return availableCab.map(cab -> {
                cab.setAvailable(false); // Set cab as unavailable
                double calculatedFare = fareCalculator.calculateFare(distance, 10.0); // Use 10.0 (double)
                Ride ride = new Ride(UUID.randomUUID().toString(), userId, cab.getCabId(), calculatedFare);
                rides.add(ride);
                return ride;
            });
        }

        // Stream API: Get Ride History
        public List<Ride> getRideHistory() {
            return rides.stream()
                    .sorted(Comparator.comparing(Ride::getRideTime).reversed())
                    .collect(Collectors.toList());
        }

        // Stream API: Get Available Cabs
        public List<Cab> getAvailableCabs() {
            return cabs.stream()
                    .filter(Cab::isAvailable)
                    .collect(Collectors.toList());
        }

        // Stream API: Get Cabs with Contact Numbers
        public List<Cab> getCabsWithContacts() {
            return cabs.stream()
                    .filter(cab -> cab.getPhoneNumber().isPresent())
                    .collect(Collectors.toList());
        }
    }
