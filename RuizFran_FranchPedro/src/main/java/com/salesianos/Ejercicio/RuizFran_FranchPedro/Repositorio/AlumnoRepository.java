package com.salesianos.Ejercicio.RuizFran_FranchPedro.Repositorio;

import com.salesianos.Ejercicio.RuizFran_FranchPedro.Clases.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
