package com.demo.model;

import com.demo.model.entity.Usuario;

public class ModeloUsuario extends Model {

    static public boolean logIn(Usuario user) {
        boolean band = false;
        if (user.getEmail().compareTo("carloslongmel@gmail.com") == 0 && user.getClave().compareTo("987654321") == 0) {
            band = true;
        } else {
            band = false;
        }

        return band;
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
