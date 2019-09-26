package com.demo.model;

import java.awt.HeadlessException;
//import java.sql.Statement;
//import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class conexionMySQL{
    Connection con=null;
    static String zonaHora = "?useTimezone=true&serverTimezone=UTC"; //Horario del servidor
    //static String SSL= "?autoReconnect=true&useSSL=false";
    static String nombreDriver = "com.mysql.cj.jdbc.Driver";//Conexion con driver JDBC
    static String url = "jdbc:mysql://127.0.0.1:3306/logueo" +zonaHora; //URL de BD
    static String usuario = "root"; //usuario de BD
    static String contraseña = ""; //contraseña de BD

    public conexionMySQL() {
        try {
            //nombre del driver
            Class.forName(nombreDriver);
            con = DriverManager.getConnection(url, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Conexion satisfactoria a la base de datos: logueo");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e);
        }
    }
    
    public Connection getConnection(){
        return this.con;
    }
    
    public void desconectarBD(){
        System.out.println("Cerrar conexión a base de datos");
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("No se realizó la desconexión: " + ex.getMessage());
            }
        }
    }
    
   /*
    public static void main(String[] args) {
        conexionMySQL conecta = new conexionMySQL();
         
        Statement st;
        ResultSet result;

        try {
            st = conecta.con.createStatement();
            result = st.executeQuery("select * from paciente");
            while(result.next()) {
                System.out.println(result.getString("id_paciente") + " ** " + result.getString("ape_pater_pac")+ 
                                   " ** " + result.getString("ape_mater_pac")+" ** " + result.getString("nom_pac")+
                                   " ** " + result.getDate("fecha_nac_pac"));
            }
            
           //conecta.con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }  

    }*/
}