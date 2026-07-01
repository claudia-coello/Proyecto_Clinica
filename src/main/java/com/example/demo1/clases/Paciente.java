package com.example.demo1.clases;

public class Paciente extends Usuario {
    public Paciente() {
    }

    public Paciente(String nombre, String correo, String clave, boolean activo) {
        super(nombre, correo, clave, activo);
    }

    public Paciente(int id, String nombre, String correo, String clave, boolean activo) {
        super(id, nombre, correo, clave, activo);
    }

    @Override
    public String toString(){
        return 
            super.toString() + 
            "Paciente"
        ;
    }
}
