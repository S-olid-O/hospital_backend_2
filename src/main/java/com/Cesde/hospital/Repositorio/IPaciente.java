package com.Cesde.hospital.Repositorio;

import com.Cesde.hospital.Modelo.MPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPaciente extends JpaRepository<MPaciente, String> {

    @Query(value = """
            SELECT
                P.nompaciente AS nompaciente,
                P.telpaciente AS telpaciente,
                C.codcita AS codcita,
                C.fecha AS fecha,
                C.idpaciente AS idpaciente,
                M.nommedico AS nommedico
            FROM paciente P
            INNER JOIN cita C ON P.idpaciente = C.idpaciente
            INNER JOIN medico M ON C.idmedico = M.idmedico
            WHERE P.idpaciente = :idpaciente""", nativeQuery = true)
    List<ICitasPacienteProyeccion> consultaCitasPorPaciente(@Param("idpaciente") String idpaciente);
}