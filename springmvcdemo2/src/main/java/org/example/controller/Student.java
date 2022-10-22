package org.example.controller;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.LinkedHashMap;


public class Student {

    @NotNull(message = "is required")
    @Size(min=4,max=100,message = "can't be less than 1 char")
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1,max=100,message = "can't be less than 1 char")
    private String lastName;

    private String Gender;

    private String favouriteLanguage;

    private String operatingSystems[];

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    private LinkedHashMap<String,String> genderOptions;

    public Student() {
        genderOptions=new LinkedHashMap<>();
        genderOptions.put("male","male");
        genderOptions.put("female","female"); //first is the value second is the label
    }

    public LinkedHashMap<String,String> getGenderOptions(){
        return genderOptions;
    }
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
