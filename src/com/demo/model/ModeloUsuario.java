package com.demo.model;

import com.demo.model.entity.Usuario;
import com.demo.view.VistaLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModeloUsuario extends Model {


    static public boolean logIn(Usuario user) {
    
        int resultado=0;
        conexionMySQL connect = new conexionMySQL();
           
        boolean bandera = false;
        try {
            Statement st;
            ResultSet result;
            
            String sql = "select * from usuario where email='"+user.getEmail()+"' and contraseña='"+user.getClave()+"'";
            st = connect.con.createStatement();
            result = st.executeQuery(sql);
            if (result.next()) {
                resultado=1;
                
                 if (resultado==1) {
                JOptionPane.showMessageDialog(null, "Acceso permitido a "+user.getEmail());
                    
                }else{
                 JOptionPane.showMessageDialog(null, "Acceso denegado");
                 }
            }
//            if (user.getEmail().compareTo("carloslongmel@gmail.com") == 0 && user.getClave().compareTo("987654321") == 0) {
//                bandera = true;
//            } else {
//                bandera = false;
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return bandera;
    }

    static public String LogUp() {
        String regis = "";
        return regis;
    }

    static public String LogRecu() {
        String recu = "";

        return recu;
    }
}
