/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author HP
 */
public class testModel {
    private String haber_id;
    private String haber_resim;
    private String haber_baslik;
    private String haber_icerik;
    private String haber_turu;
    private String tarih;
    private int likes;
    private int dislike;
    private int göruntuleme; 

    public testModel(String haber_id, String haber_resim, String haber_baslik, String haber_icerik, String haber_turu, String tarih, int likes, int dislike, int göruntuleme) {
        this.haber_id = haber_id;
        this.haber_resim = haber_resim;
        this.haber_baslik = haber_baslik;
        this.haber_icerik = haber_icerik;
        this.haber_turu = haber_turu;
        this.tarih = tarih;
        this.likes = likes;
        this.dislike = dislike;
        this.göruntuleme = göruntuleme;
    }

    testModel() {
        
    }
    
    

    public String getHaber_id() {
        return haber_id;
    }

    public void setHaber_id(String haber_id) {
        this.haber_id = haber_id;
    }

    public String getHaber_resim() {
        return haber_resim;
    }

    public void setHaber_resim(String haber_resim) {
        this.haber_resim = haber_resim;
    }

    public String getHaber_baslik() {
        return haber_baslik;
    }

    public void setHaber_baslik(String haber_baslik) {
        this.haber_baslik = haber_baslik;
    }

    public String getHaber_icerik() {
        return haber_icerik;
    }

    public void setHaber_icerik(String haber_icerik) {
        this.haber_icerik = haber_icerik;
    }

    public String getHaber_turu() {
        return haber_turu;
    }

    public void setHaber_turu(String haber_turu) {
        this.haber_turu = haber_turu;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getGöruntuleme() {
        return göruntuleme;
    }

    public void setGöruntuleme(int göruntuleme) {
        this.göruntuleme = göruntuleme;
    }
    
    

   
}
