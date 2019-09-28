/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author HP
 */
public class aa {
    public static void main(String[] args) {
        try {
            Connection con;
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/haber","ozge","12345");
            System.out.println("baglandi");
        } catch (SQLException ex) {
            Logger.getLogger(aa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
