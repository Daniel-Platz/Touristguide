package org.example.touristguidedel2.model;

public enum City {
    KØBENHAVN("København"),
    MØN("Møn"),
    BILLUND("Billund"),
    HELSINGØR("Helsingør"),
    AARHUS("Aarhus"),
    RIBE("Ribe");

    private final String displayName;

    City(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}