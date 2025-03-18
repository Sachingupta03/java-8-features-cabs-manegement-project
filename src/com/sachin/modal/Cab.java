package com.sachin.modal;

import java.util.Optional;

public class Cab {
    private String cabId;
    private String driverName;
    private String type; // Sedan, suv, TataPunch
    private boolean available;
    private Optional<String> phoneNumber;

    public Cab(String cabId, String driverName, String type, boolean available, String phoneNumber) {
        this.cabId = cabId;
        this.driverName = driverName;
        this.type = type;
        this.available = available;
        this.phoneNumber = Optional.ofNullable(phoneNumber);
    }

    public String getCabId() {
        return cabId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Cab{" + "cabId='" + cabId + '\'' + ", driverName='" + driverName + '\'' +
                ", type='" + type + '\'' + ", available=" + available +
                ", phoneNumber=" + phoneNumber.orElse("Not Available") + '}';

    }

}
