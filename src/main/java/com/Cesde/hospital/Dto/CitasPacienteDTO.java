package com.Cesde.hospital.Dto;

import java.time.LocalDate;

public record CitasPacienteDTO(
        String nompaciente,
        String telpaciente,
        Integer codcita,
        LocalDate fecha,
        String idpaciente,
        String nommedico
) {}