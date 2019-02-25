package com.liam191.journeystore.repo;

import java.util.Objects;

public class Journey {

    private int i;

    public Journey(int i) {

        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journey journey = (Journey) o;
        return i == journey.i;
    }

    @Override
    public int hashCode() {

        return Objects.hash(i);
    }
}
