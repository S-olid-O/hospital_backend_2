package com.Cesde.hospital.Servicio;

import com.Cesde.hospital.Dto.CitasPacienteDTO;
import com.Cesde.hospital.Mapper.ICitaPacienteMapper;
import com.Cesde.hospital.Repositorio.ICitasPacienteProyeccion;
import com.Cesde.hospital.Repositorio.IPaciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SPaciente {

    private final IPaciente iPaciente;
    private final ICitaPacienteMapper iCitaPacienteMapper;

    // Inyección de dependencias por constructor
    public SPaciente(IPaciente iPaciente, ICitaPacienteMapper iCitaPacienteMapper) {
        this.iPaciente = iPaciente;
        this.iCitaPacienteMapper = iCitaPacienteMapper;
    }

    // Método que consume la consulta nativa y retorna el DTO
    public List<CitasPacienteDTO> obtenerCitasPorPaciente(String idpaciente) {
        // 1. Ejecutar la consulta en el repositorio
        List<ICitasPacienteProyeccion> proyecciones = this.iPaciente.consultaCitasPorPaciente(idpaciente);

        // 2. Mapear las proyecciones a DTOs y retornar
        return this.iCitaPacienteMapper.toDTOList(proyecciones);
    }
}