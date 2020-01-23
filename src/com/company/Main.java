package com.company;

public class Main {

    public static void main(String[] args) {
        Photo photo1 = new Photo(10);
        Photo photo2 = new Photo(20);
        Photo photo3 = new Photo(30);
        Photo photo4 = new Photo(40);
        Photo photo5 = new Photo(50);
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.addPhoto(photo1);
        photoAlbum.addPhoto(photo2);
        photoAlbum.addPhoto(photo3);
        photoAlbum.addPhoto(photo4);
        photoAlbum.addPhoto(photo5);
        photoAlbum.printQuantityOfPhotos();
        photoAlbum.giveNameToPhotoByIndex();
        System.out.println(photo1.getName());
    }
}
