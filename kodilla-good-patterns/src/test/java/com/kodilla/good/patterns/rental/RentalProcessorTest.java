package com.kodilla.good.patterns.rental;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class RentalProcessorTest {

    @Test
    public void testRentalProccesor() {
        //Given
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

        //Then
        assertTrue(rentalDto.isProcessed());
        assertFalse(rentalDto2.isProcessed());
        assertFalse(rentalDto3.isProcessed());
    }

}