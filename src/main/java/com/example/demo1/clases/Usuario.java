package com.example.demo1.clases;

public abstract class Usuario {
    private int id;
    private String nombre, correo, clave;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String clave, boolean activo) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.activo = activo;
    }


    public Usuario(int id, String nombre, String correo, String clave, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return (
            "\nID: " + id + 
            "\nNombre: " + nombre + 
            "\nCorreo=" + correo +
            "\nClave=" + clave +
            "\nActivo=" + activo + 
            "\nTipo Usuario: "
        );
    }
}

