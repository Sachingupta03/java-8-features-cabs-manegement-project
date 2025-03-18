package com.sachin.modal;

public class User {
        private String userId;
        private String name;
        private String phoneNumber;

        public User(String userId, String name, String phoneNumber) {
            this.userId = userId;
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getUserId() { return userId; }
        public String getName() { return name; }
        public String getPhoneNumber() { return phoneNumber; }

        @Override
        public String toString() {
            return "User{" + "userId='" + userId + '\'' + ", name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + "'}";
        }
    }


