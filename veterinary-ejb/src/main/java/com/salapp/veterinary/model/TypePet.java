package com.salapp.veterinary.model;

/**
 * @author Stainley A. Lebron R.
 * @since on 11/4/15.
 */

public enum TypePet {

    FISH(0), MAMMALS(1), BIRDS(2), REPTIL(3), AMPHIBIANS(4), INVERTEBRATES(5);

    TypePet(int index){
        this.index = index;
    }

    private int index;
}
