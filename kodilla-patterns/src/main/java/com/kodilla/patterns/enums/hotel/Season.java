package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {
    LOW,
    HIGH,
    HOLIDAY;


    private BigDecimal singleRoomPrice;
    private BigDecimal doubleRoomPrice;

    Season(BigDecimal singleRoomPrice, BigDecimal doubleRoomPrice) {
        this.singleRoomPrice = singleRoomPrice;
        this.doubleRoomPrice = doubleRoomPrice;

        public BigDecimal getSingleRoomPrice() {
            return singleRoomPrice;
        }

        public BigDecimal getDoubleRoomPrice() {
            return doubleRoomPrice;
        }

    }

    public String getSingleBedPrice(String low) {
    }

    public String getDoubleBedPrice(String holiday) {
    }
}