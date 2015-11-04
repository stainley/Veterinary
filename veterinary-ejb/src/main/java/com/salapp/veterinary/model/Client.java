package com.salapp.veterinary.model;

/**
 * @author Stainley A. Lebron R.
 * @since on 11/4/15.
 */
public class Client {

    private long id;
    private PersonalData personalData;
    private Pet pet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
