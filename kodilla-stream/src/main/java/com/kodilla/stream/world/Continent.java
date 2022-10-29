package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private Set<Country> countries = new HashSet<>();

    public Continent(String continentName, Set<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        this.countries.add(country);
    }

    public boolean removeCountry (Country country) {
        return this.countries.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return countries;
    }
}
