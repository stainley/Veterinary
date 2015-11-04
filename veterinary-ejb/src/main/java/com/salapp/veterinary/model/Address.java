package com.salapp.veterinary.model;

/**
 * @author Stainley A. Lebron R.
 * @since on 11/4/15.
 */
public class Address {

    private long id;
    private String state;
    private String country;
    private String city;
    private String territorialUnit;
    private String street;
    private String houseNum;
    private String zipcode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTerritorialUnit() {
        return territorialUnit;
    }

    public void setTerritorialUnit(String territorialUnit) {
        this.territorialUnit = territorialUnit;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipode) {
        this.zipcode = zipode;
    }
}
