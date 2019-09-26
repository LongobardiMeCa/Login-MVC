package com.demo.model.entity;

public class Usuario {

    private long id;
    private String email;
    private String clave;
    private String apellidos;
    private String nombres;
    private int tipo;
    private String claveRecupe;

    public Usuario(long id, String email, String clave, String apellidos, String nombres, int tipo, String claveRecupe) {
        this.id = id;
        this.email = email;
        this.clave = clave;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo = tipo;
        this.claveRecupe= claveRecupe;
    }

    public Usuario(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public String getclaveRecupe(){
        return claveRecupe;
    }
    
    public void setclaveRecupe(String claveRecupe){
        this.claveRecupe=claveRecupe;
    }
}
