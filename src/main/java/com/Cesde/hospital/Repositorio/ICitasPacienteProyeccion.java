package com.Cesde.hospital.Repositorio;

import java.time.LocalDate;

public interface ICitasPacienteProyeccion {
    String getNompaciente();
    String getTelpaciente();
    Integer getCodcita();
    LocalDate getFecha();
    String getIdpaciente();
    String getNommedico();
}