package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.Objects;


public class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(final BigDecimal numberOfInhabitants, final String countryName) {
        this.peopleQuantity = numberOfInhabitants;
        this.countryName = countryName;

    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(peopleQuantity, country.peopleQuantity) && Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleQuantity, countryName);
    }
}
