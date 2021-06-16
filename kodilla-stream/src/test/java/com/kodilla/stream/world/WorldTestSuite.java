package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        Country country1 = new Country(BigDecimal.TEN, "Poland");
        Country country2 = new Country(BigDecimal.ONE, "Germany");
        Country country3 = new Country(new BigDecimal(5), "Egypt");

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Africa");

//        continent1.getCountries().add(country1);
//        continent1.getCountries().add(country2);
//        continent2.getCountries().add(country3);
//
//        World world = new World();
//        world.getContinents().add(continent1);
//        world.getContinents().add(continent2);

        //when
//        BigDecimal result = world.getPeopleQuantity();

        //then
//        Assertions.assertEquals(new BigDecimal(16), result);
    }
}
