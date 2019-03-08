package com.liam191.journeystore.repo;

import java.util.Objects;

final public class Journey {

    private final String departureAddress;

    public Journey(String departureAddress) {
        validateArgs(departureAddress);
        this.departureAddress = departureAddress;
    }

    private void validateArgs(String departureAddress) {
        if(departureAddress == null){
            throw new IllegalArgumentException("Expected departure address to be a String instance. Got a null reference.");
        }
    }

    public String getDepartureAddress(){
        return departureAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journey journey = (Journey) o;
        return Objects.equals(getDepartureAddress(), journey.getDepartureAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAddress());
    }
}
