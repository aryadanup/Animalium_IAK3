package com.example.aryadanuprengga.animalium;

/**
 * Created by Arya Danu Prengga on 5/7/2017.
 */

public class AnimalModel {
    String namaIndonesia,namaEnglish;
    int gambar;

    public String getNamaIndonesia() {
        return namaIndonesia;
    }

    public String getNamaEnglish() {
        return namaEnglish;
    }

    public int getGambar() {
        return gambar;
    }

    public AnimalModel(String namaIndonesia, String namaEnglish, int gambar){
        this.namaIndonesia=namaIndonesia;
        this.namaEnglish=namaEnglish;
        this.gambar=gambar;

    }
}
