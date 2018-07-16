/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import labs.mvc.util.Connect;



public class UserModel {
    boolean status;
    Connection connect =  Connect.getCon();
    
    public boolean insert(String username, String password){
        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                String sql = "INSERT INTO user VALUES (null,'"+username+"','"+password+"',now())";
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.execute();
                status =  true;
            } catch (SQLException ex) {
                status = false;
            }
        }
        return status;
    }
}
