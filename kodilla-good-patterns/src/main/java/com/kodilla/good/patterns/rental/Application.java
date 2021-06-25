package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class Application {


    public static void main(String[] args) {
        InformationService informationService = new InformationServiceImpl();
        RentalService rentalService = new RentalServiceImpl();
        RentalRepository rentalRepository = new RentalRepositoryImpl();

        RentalProcessor rentalProcessor = new RentalProcessor(informationService, rentalService, rentalRepository);

        User validUser = new User("John", "Doe", 20, 100);
        User underagedUser = new User("Marc", "Smith", 15, 100);
        User userWithoutMoney = new User("David", "Leono", 25, 0);

        RentRequest validRentRequest = new RentRequest(validUser, LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        RentRequest invalidRentRequest = new RentRequest(underagedUser, LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        RentRequest invalidRentRequest2 = new RentRequest(userWithoutMoney, LocalDateTime.now(), LocalDateTime.now().plusDays(1));

        RentalDto rentalDto = rentalProcessor.process(validRentRequest);
        RentalDto rentalDto2 = rentalProcessor.process(invalidRentRequest);
        RentalDto rentalDto3 = rentalProcessor.process(invalidRentRequest2);

        System.out.println("Rental status:");
        System.out.println("Rental for user " + rentalDto.getUser() + " processed: " + rentalDto.isProcessed());
        System.out.println("Rental for user " + rentalDto2.getUser() + " processed: " + rentalDto2.isProcessed());
        System.out.println("Rental for user " + rentalDto3.getUser() + " processed: " + rentalDto3.isProcessed());
    }
}