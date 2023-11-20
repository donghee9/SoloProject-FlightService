package com.example.filghtApp.domain.dto;

public enum ReservationStatusType {
    RESERVED(1),      // Indicates a reserved status
    CONFIRMED(2),     // Indicates a confirmed status
    CANCELLED(3),     // Indicates a cancelled status
    CHECKED_IN(4);    // Indicates a checked-in status

    private final int value;

    ReservationStatusType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ReservationStatusType fromValue(int value) {
        for (ReservationStatusType type : values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("No reservation status type for value " + value);
    }
}
