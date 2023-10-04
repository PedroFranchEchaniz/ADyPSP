package com.salesianos.Ejercicio.RuizFran_FranchPedro.Dto;

import com.salesianos.Ejercicio.RuizFran_FranchPedro.Clases.Alumno;
import com.salesianos.Ejercicio.RuizFran_FranchPedro.Clases.Curso;
import com.salesianos.Ejercicio.RuizFran_FranchPedro.Clases.Direccion;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AlumnoDTO {

    private String nombreAlumno, apellidoAlumno, apellido2Alumno, emailAlumno, cursoAlumno;
    private String direccion;

    public static AlumnoDTO of(Alumno alumno){
        return AlumnoDTO.builder()
                .nombreAlumno(alumno.getNombre())
                .apellidoAlumno(alumno.getApellido1())
                .apellido2Alumno(alumno.getApellido2())
                .emailAlumno(alumno.getEmail())
                .cursoAlumno(alumno.getCurso() != null ? alumno.getCurso().getNombre() : "no hay curso")
                .direccion(alumno.getDireccion() != null ? alumno.getDireccion().getLinea1(): "no hay direccion")
                .build();
    }
}
