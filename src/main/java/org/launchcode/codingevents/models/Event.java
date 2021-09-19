package org.launchcode.codingevents.models;


import javax.validation.constraints.*;

import java.util.Date;
import java.util.Objects;

public class Event {

    private int id;

    //Creating a static field 'nextId', to create an unique id to all the objects of this class
    private static int nextId = 1;

    //Adding validation
    @NotBlank(message="Name required")
@Size(min = 3,max = 50,message = "Name must be between 3 and 50 characters!")
    private String name;

@Size(max = 500, message = "Description too long!")
    private String description;

@NotBlank(message="Email required")
@Email(message = "Invalid Email. Try Again!")
private String contactEmail;

//Adding a new fields as per the excercise instruction
@NotBlank(message="Location required")
@Size(max = 500)
    private String location;

@AssertTrue(message = "Must be True")
private boolean register;

    @Positive(message="Number of attendees must be more than zero")
private int numberOfAttendees;

@Future
    private Date date;



    //Constructor
    public Event(String name, String description, String contactEmail,String location, boolean register,int numberOfAttendees,Date date) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        this.contactEmail = contactEmail;
        this.location = location;
        this.register = register;
        this.numberOfAttendees = numberOfAttendees;
        this.date = date;
        nextId++;
    }

    //Constructor with no arguments
    public Event(){

    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRegister() {+
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    //only getter for ID, coz we dont allow others to set the id, we need a unique id

    public int getId() {
        return id;
    }


    //toString

    @Override
    public String toString() {
        return name;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
