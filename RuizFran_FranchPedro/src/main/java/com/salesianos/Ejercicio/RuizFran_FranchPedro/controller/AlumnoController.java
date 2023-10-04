package com.salesianos.Ejercicio.RuizFran_FranchPedro.controller;

import com.salesianos.Ejercicio.RuizFran_FranchPedro.Clases.Alumno;
import com.salesianos.Ejercicio.RuizFran_FranchPedro.Dto.AlumnoDTO;
import com.salesianos.Ejercicio.RuizFran_FranchPedro.Repositorio.AlumnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
@RequiredArgsConstructor
public class AlumnoController {

    private final AlumnoRepository alumnoRepository;

    @GetMapping("/")
    public ResponseEntity<List<AlumnoDTO>> todos(){

        List<Alumno> listaAlumnos = alumnoRepository.findAll();

        if(listaAlumnos.isEmpty())
            return  ResponseEntity.notFound().build();
        List<AlumnoDTO> result =
                listaAlumnos.stream()
                        .map(AlumnoDTO::of)
                        .toList();
        return ResponseEntity.ok(result);
    }
}
