package com.tedeevgv.patterns.creational.builder;

import java.time.LocalDate;

public class Trip {
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String country;

    @Override
    public String toString() {
        return "Trip{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", country='" + country + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }

    private final String hotelName;
    private final String flightNumber;

    private Trip(LocalDate startDate, LocalDate endDate, String country, String hotelName, String flightNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.country = country;
        this.hotelName = hotelName;
        this.flightNumber = flightNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private LocalDate startDate;
        private LocalDate endDate;
        private String country;
        private String hotelName;
        private String flightNumber;

        public Builder(){
        }

        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder hotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }

        public Builder flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Trip build() {
            return new Trip(startDate, endDate, country, hotelName, flightNumber);
        }
    }
}
