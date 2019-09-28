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
public class mymodel {
    private String firme_id;
    private String firma_name;
    private String firma_lat;
    private String firma_long;
    private String icerik;
    private String sure;

    public mymodel() {
    }

    public mymodel(String firme_id, String firma_name, String firma_lat, String firma_long, String icerik, String sure) {
        this.firme_id = firme_id;
        this.firma_name = firma_name;
        this.firma_lat = firma_lat;
        this.firma_long = firma_long;
        this.icerik = icerik;
        this.sure = sure;
    }
    
    

    public String getFirme_id() {
        return firme_id;
    }

    public void setFirme_id(String firme_id) {
        this.firme_id = firme_id;
    }

    public String getFirma_name() {
        return firma_name;
    }

    public void setFirma_name(String firma_name) {
        this.firma_name = firma_name;
    }

    public String getFirma_lat() {
        return firma_lat;
    }

    public void setFirma_lat(String firma_lat) {
        this.firma_lat = firma_lat;
    }

    public String getFirma_long() {
        return firma_long;
    }

    public void setFirma_long(String firma_long) {
        this.firma_long = firma_long;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }
    
    
}
