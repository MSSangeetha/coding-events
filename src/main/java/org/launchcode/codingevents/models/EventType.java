package org.launchcode.codingevents.models;

public enum EventType {

    //FIELD NAMES
    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;

    //Constructor
    EventType(String displayName) {
        this.displayName = displayName;
    }

    //Getter
    //No setter required as the variable is declared final(we cant set values to that variable)
    public String getDisplayName() {
        return displayName;
    }
}
