package com.example.filghtApp.domain.dto;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger PassengerId = new AtomicInteger(0);
    private static final AtomicInteger TicketsId = new AtomicInteger(0);
    private static final AtomicInteger ReservationId = new AtomicInteger(0);

    public static int getNextPassengerId() {
        return PassengerId.incrementAndGet();
    }

    public static int getNextTicketsId() {
        return TicketsId.incrementAndGet();

    }
    public static int getNextReservationId() {
        return ReservationId.incrementAndGet();

    }
}
