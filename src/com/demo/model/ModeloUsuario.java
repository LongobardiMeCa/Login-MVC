package com.demo.model;

import com.demo.model.entity.Usuario;
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
        int resultado = 0;
        conexionMySQL connect = new conexionMySQL();
        boolean bandera = false;
        try {
            Statement st;
            ResultSet result;

            String sql = "select * from usuario where email='" + user.getEmail() + "' and contraseña='" + user.getClave() + "'";
            st = connect.con.createStatement();
            result = st.executeQuery(sql);
            if (result.next()) {
                resultado = 1;

                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Acceso permitido a " + user.getEmail());
                    bandera=true;
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return bandera;
       
    }

    static public boolean LogUp(Usuario user) {
        boolean regis = false;
        conexionMySQL registrar = new conexionMySQL();
        Connection cc= registrar.getConnection();
        String sql = "insert into usuario(nom_user,ape_pater_user,ape_mater_user,contraseña,email)values ('"+user.getNombre()+"','"+user.getape_pater()+"','"+user.getape_mater()+"','"+user.getClave()+"','"+user.getEmail()+"')";
        try {
            PreparedStatement pst = registrar.con.prepareStatement(sql);
//            pst.setString(1,""+user.getNombre());
//            pst.setString(2,""+user.getape_pater());
//            pst.setString(3,""+user.getape_mater());
//            pst.setString(4,""+user.getClave());
//            pst.setString(5,""+user.getEmail());
            pst.execute();
            regis=true;
        } catch (Exception e) {
        }

        
        return regis;
    }

    static public String LogRecu() {
        String recu = "";

        return recu;
    }
}
