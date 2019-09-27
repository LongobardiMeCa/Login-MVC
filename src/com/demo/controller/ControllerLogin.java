/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;

/**
 *
 * @author whiston
 */
public class ControllerLogin extends Controller {
    
    public ControllerLogin(){
    
    }
    
    public boolean logIn(String email, String clave){
        boolean band;
        Usuario user= new Usuario(email, clave);
        band = ModeloUsuario.logIn(user);
        return band;
    }

    public boolean logUp(String nom, String apePater, String apeMater,String email, String clave){
        boolean status;
        Usuario envio = new Usuario(nom,apePater,apeMater,email,clave);
        status=ModeloUsuario.LogUp(envio);
        return status;
    }
    
    public long RecuperarClave(){
        long status = 0;
        return status;
    }
    
}
