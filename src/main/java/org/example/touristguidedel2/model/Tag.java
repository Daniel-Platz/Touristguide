package org.example.touristguidedel2.model;

public enum Tag {
    RESTAURANT("Restaurant"),
    FORLYSTELSESPARK("Forlystelsespark"),
    NATUROPLEVELSE("Naturoplevelse"),
    KUNST("Kunst"),
    HISTORIE("Historie"),
    LANDSKAB("Landskab"),
    ARKITEKTUR("Arkitektur"),
    UDSIGTSPUNKT("Udsigtspunkt"),
    MUSEUM("Museum");

    private final String displayName;

    Tag(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}