package com.Cesde.hospital.Mapper;

import com.Cesde.hospital.Dto.CitasPacienteDTO;
import com.Cesde.hospital.Repositorio.ICitasPacienteProyeccion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICitaPacienteMapper {

    CitasPacienteDTO toDTO(ICitasPacienteProyeccion proyeccion);

    List<CitasPacienteDTO> toDTOList(List<ICitasPacienteProyeccion> proyecciones);
}