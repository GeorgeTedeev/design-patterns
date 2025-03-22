package com.tedeevgv.patterns.creational.builder;

import java.time.LocalDate;

public class BuilderClient {
    public static void main(String[] args) {
        var trip = Trip.builder()
                .startDate(LocalDate.now().plusDays(10))
                .endDate(LocalDate.now().plusDays(17))
                .country("Argentina")
                .flightNumber("123")
                .hotelName("Fairmont")
                .build();

        System.out.println("Built trip: " + trip);
    }
}
