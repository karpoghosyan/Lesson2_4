package com.company;

import java.util.ArrayList;

public class Photo {
    //region Properties
    private int name;
    //endregion

    //region Constructors

    public Photo() {

    }

    public Photo(int name) {
        this.name = name;
    }
    //endregion

    //region Getters and Setters

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    //endregion

    //region  equals hashcode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        return name == photo.name;
    }

    @Override
    public int hashCode() {
        return name;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name=" + name +
                '}';
    }

//endregion
}
