package com.sachin.controller;

import com.sachin.service.BookingCabService;

public class CabController {
        private BookingCabService cabService = new BookingCabService();

        public void bookCab(String userId, double distance) {
            cabService.bookRide(userId, distance)
                    .ifPresentOrElse(
                            ride -> System.out.println("Ride Booked Successfully! Details: " + ride),
                            () -> System.out.println("No available cabs at the moment!")
                    );
        }

        public void showAvailableCabs() {
            System.out.println("\n=== Available Cabs ===");
            cabService.getAvailableCabs().forEach(System.out::println);
        }

        public void showRideHistory() {
            System.out.println("\n=== Ride History ===");
            cabService.getRideHistory().forEach(System.out::println);
        }

        public void showCabsWithContacts() {
            System.out.println("\n=== Cabs with Contact Numbers ===");
            cabService.getCabsWithContacts().forEach(System.out::println);
        }
    }


