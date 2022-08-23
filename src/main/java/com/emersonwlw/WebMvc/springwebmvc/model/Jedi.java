package com.emersonwlw.WebMvc.springwebmvc.model;

import javax.validation.constraints.NotBlank;

public class Jedi {
    @NotBlank
    private  String firstName;
    @NotBlank
    private  String lastName;

    public Jedi(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Jedi() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
