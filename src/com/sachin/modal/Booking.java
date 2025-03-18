package com.sachin.modal;

import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private User user;
    private Cab cab;
    private LocalDateTime bookingTime;
    private LocalDateTime tripStartTime;
    private LocalDateTime tripEndTime;

    // Constructor, Getters, and Setters
    public Booking(String bookingId, User user, Cab cab, LocalDateTime bookingTime) {
        this.bookingId = bookingId;
        this.user = user;
        this.cab = cab;
        this.bookingTime = bookingTime;
    }
    // Getters and Setters
    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Cab getCab() { return cab; }
    public void setCab(Cab cab) { this.cab = cab; }
    public LocalDateTime getBookingTime() { return bookingTime; }
    public void setBookingTime(LocalDateTime bookingTime) { this.bookingTime = bookingTime; }
    public LocalDateTime getTripStartTime() { return tripStartTime; }
    public void setTripStartTime(LocalDateTime tripStartTime) { this.tripStartTime = tripStartTime; }
    public LocalDateTime getTripEndTime() { return tripEndTime; }
    public void setTripEndTime(LocalDateTime tripEndTime) { this.tripEndTime = tripEndTime; }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", user=" + user +
                ", cab=" + cab +
                ", bookingTime=" + bookingTime +
                ", tripStartTime=" + tripStartTime +
                ", tripEndTime=" + tripEndTime +
                '}';
    }

}
