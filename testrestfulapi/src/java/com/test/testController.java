/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.print.ServiceUIFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author HP
 */
@Path("testcontroller")
public class testController 
{ 
    @GET
    @Path("/getData")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<mymodel> getdataInJSON() throws ClassNotFoundException, SQLException{
    
        ArrayList<mymodel> myy=new ArrayList<>();
        Connection conn=null;
        Statement statement=null;
        String query="select * from firma";
        try
        {
            //Driverı ekliyoruz.
            Class.forName("com.mysql.jdbc.Driver");     
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/reklam","root","1234");               
            statement=(Statement) conn.createStatement();
            ResultSet rs=statement.executeQuery(query);
             while(rs.next())
        {
            mymodel my=new mymodel(); 
            my.setFirme_id(rs.getString("firma_id"));
            my.setFirma_name(rs.getString("firma_name"));
            my.setFirma_lat(rs.getString("lat"));
            my.setFirma_long(rs.getString("longg"));
            my.setIcerik(rs.getString("icerik"));
            my.setSure(rs.getString("sure"));
            
            myy.add(my);
        }
        return myy;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }        
        return null;
    }
    
    @GET
    @Path("/update/{id}/{nmbr}")
    @Produces(MediaType.APPLICATION_JSON)
    public int update(@PathParam("id") String id, @PathParam("nmbr") String nmbr) {
        ArrayList<testModel> tmm = new ArrayList<>();
        Connection conn ;
        Statement statement ;
        int ıd = Integer.valueOf(id);
        int nmb2 = Integer.valueOf(nmbr);
        String query = "select * from haber where haber_id=" + id;
        try {
            
            Class.forName("com.mysql.jdbc.Driver"); 
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/haberler","root","2323");

            statement =  conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            if 
