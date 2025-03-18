package com.sachin.modal;

    import java.time.LocalDateTime;

    public class Ride {
        private String rideId;
        private String userId;
        private String cabId;
        private double fare;
        private LocalDateTime rideTime; // Java 8 Date-Time API

        public Ride(String rideId, String userId, String cabId, double fare) {
            this.rideId = rideId;
            this.userId = userId;
            this.cabId = cabId;
            this.fare = fare;
            this.rideTime = LocalDateTime.now(); // Current Time
        }

        public String getRideId() { return rideId; }
        public String getUserId() { return userId; }
        public String getCabId() { return cabId; }
        public double getFare() { return fare; }
        public LocalDateTime getRideTime() { return rideTime; }

        @Override
        public String toString() {
            return "Ride{" + "rideId='" + rideId + '\'' + ", userId='" + userId + '\'' +
                    ", cabId='" + cabId + '\'' + ", fare=" + fare + ", rideTime=" + rideTime + '}';
        }
    }


