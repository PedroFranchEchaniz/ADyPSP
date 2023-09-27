package com.salesianostriana.dam._EjemploApiRest;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Alumno {
    private int id;
    private String nombre, apellidos, email;
    private int edad;
}
