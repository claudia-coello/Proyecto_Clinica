package com.example.demo1.clases;

import java.time.LocalDateTime;

public class Cita {
    private int id, id_usuario, id_doctor;
    private String estado;
    private LocalDateTime fechaCita;

    public Cita() {
    }

    public Cita(int id_usuario, int id_doctor, String estado, LocalDateTime fecha) {
        this.id_usuario = id_usuario;
        this.id_doctor = id_doctor;
        this.estado = estado;
        this.fechaCita = fecha;
    }

    public Cita(int id, int id_usuario, int id_doctor, String estado, LocalDateTime fecha) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_doctor = id_doctor;
        this.estado = estado;
        this.fechaCita = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cita{");
        sb.append("id=").append(id);
        sb.append(", id_usuario=").append(id_usuario);
        sb.append(", id_doctor=").append(id_doctor);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCita=").append(fechaCita);
        sb.append('}');
        return sb.toString();
    }

}
