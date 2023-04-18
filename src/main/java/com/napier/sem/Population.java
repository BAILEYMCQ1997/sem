package com.napier.sem;

/**
 * The type Population.
 */
public class Population {
    /*
     * The name of the continent/region/country.
     * */
    public String locationName;

    /*
     * The total population of the continent/region/country.
     * */
    public Long wholeLocationPopulation;
}
/*
 * The total population of the continent/region/country living in cities (including a %).
 * */
public double wholeLocationPopulationInCitiesPercentage;
    /*
     * The total population of the continent/region/country not living in cities (including a %).
     * */
    public Long wholeLocationPopulationNotInCities;

    public double wholeLocationPopulationNotInCitiesPercentage;

    /**
     * Instantiates a new Population.
     */
    public Population() {
    }

    /**
     * Instantiates a new Population.
     *
     * @param locationName                       the location name
     * @param wholeLocationPopulation            the whole location population
     */
    public Population(String locationName, Long wholeLocationPopulation) {
        this.locationName = locationName;
        this.wholeLocationPopulation = wholeLocationPopulation;
    }

