package org.launchcode.enumerableplanets.data;

public enum Planets {
    // list the planets here.
    // Mercury, Venus, Earth, Mars, Jupiter,
    // Saturn, Uranus, Neptune
    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list

    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200),
    PLUTO("Pluto", 90520);

    private final String displayName;
    private final int yearLength;

    Planets (String displayName, int yearLength) {
        this.displayName = displayName;
        this.yearLength = yearLength;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getYearLength() {
        return yearLength;
    }
}
