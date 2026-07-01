package com.example.demo1.clases;

public class Administrador extends Usuario{
    public Administrador() {}

    public Administrador(String nombre, String correo, String clave, boolean activo) {
        super(nombre, correo, clave, activo);
    }

    public Administrador(int id, String nombre, String correo, String clave, boolean activo) {
        super(id, nombre, correo, clave, activo);
    }

    @Override
    public String toString(){
        return 
            super.toString() + 
            "Administrador"
        ;
    }
}
