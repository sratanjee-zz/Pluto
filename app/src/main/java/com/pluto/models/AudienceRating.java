package com.pluto.models;

public enum AudienceRating {
    G("General Audiences"),
    PG("Parental Guidance Suggested"),
    PG13("Parents Strongly Cautioned"),
    R("Restricted"),
    A18("Adults 18 and Over"),
    T16("Teen 16"),
    NC17("Adults Only");

    private String longName;

    public String getLongName() {
        return this.longName;
    }

    AudienceRating(String longName) {
        this.longName = longName;
    }
}
