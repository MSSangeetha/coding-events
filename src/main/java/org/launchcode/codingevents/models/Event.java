package org.launchcode.codingevents.models;

import java.util.Objects;

public class Event {

    private int id;

    //Creating a static field 'nextId', to create an unique id to all the objects of this class
    private static int nextId = 1;

    private String name;
    private String description;

    //Constructor
    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        nextId++;
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
