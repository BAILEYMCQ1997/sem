package com.napier.sem;

/**
 * The type City.
 */
public class City {

    /**
     * The ID.
     */
    private Integer id;
    /**
     * The Name.
     */
    private String name;
    /**
     * The Country code.
     */
    private String country;


    /**
     * Instantiates a new City.
     */
    public City() {
    }

    public City(Integer id, String name, String country,) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + country + '\'' +
                '}';
    }


    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country code.
     *
     * Returns desired country
     */
    public void setCountry(String country) {
        this.country = country;
    }
}