package com.company;

import java.util.ArrayList;

public class PhotoAlbum {
    //region Properties
    private Photo photo;
    private ArrayList<Photo> photoAlbom = new ArrayList<>();
    //endregion

    //region Constructors
    public PhotoAlbum() {
    }

    public PhotoAlbum(Photo photo, ArrayList<Photo> photos) {
        this.photo = photo;
        this.photoAlbom = photos;
    }

    //endregion

    //region Public Methods
    public void addPhoto(Photo photo) {
        photoAlbom.add(photo);
    }

    public void printQuantityOfPhotos() {
        System.out.println(photoAlbom.size());
    }

    public void giveNameToPhotoByIndex() {
        for (int i = 0; i < photoAlbom.size(); i++) {
            photoAlbom.get(i).setName(i);
        }
        System.out.println(photoAlbom);
    }
    //endregion

    //region Getters and Setters

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public ArrayList<Photo> getPhotoAlbom() {
        return photoAlbom;
    }

    public void setPhotoAlbom(ArrayList<Photo> photoAlbom) {
        this.photoAlbom = photoAlbom;
    }

    //endregion

    //region  equals hashcode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoAlbum that = (PhotoAlbum) o;

        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        return photoAlbom != null ? photoAlbom.equals(that.photoAlbom) : that.photoAlbom == null;
    }

    @Override
    public int hashCode() {
        int result = photo != null ? photo.hashCode() : 0;
        result = 31 * result + (photoAlbom != null ? photoAlbom.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "photo=" + photo +
                ", photoAlbom=" + photoAlbom +
                '}';
    }

    //endregion
}
