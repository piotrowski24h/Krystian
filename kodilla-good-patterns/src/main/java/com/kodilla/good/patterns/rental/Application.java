package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {

    public static <RentRequestRetriever> void main(String[] args) {
     RentRequestRetriever rentalRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentalRequestRetriever.retrieve();



        }
    }