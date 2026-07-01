package com.example.demo1.clases;

public class Doctor extends Usuario{
    private String especialidad;

    public Doctor() {
    }

    public Doctor(String nombre, String correo, String clave, boolean activo, String especialidad) {
        super(nombre, correo, clave, activo);
        this.especialidad = especialidad;
    }

    public Doctor(int id, String nombre, String correo, String clave, boolean activo, String especialidad) {
        super(id, nombre, correo, clave, activo);
        this.especialidad = especialidad;
    }

    @Override
    public String toString(){
        return 
            super.toString() + 
            "Doctor" +
            "Especialidad: " + especialidad
        ;
    }
}
