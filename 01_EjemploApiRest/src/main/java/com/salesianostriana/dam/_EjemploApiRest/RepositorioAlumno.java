package com.salesianostriana.dam._EjemploApiRest;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RepositorioAlumno {

    private List<Alumno> alumnos;

    public RepositorioAlumno(){
        alumnos = new ArrayList<>();

        alumnos.add(
                Alumno.builder()
                        .id(1)
                        .nombre("Pepe")
                        .apellidos("Pepe")
                        .edad(23)
                        .email("pepe@pepe")
                        .build()

        );

        alumnos.add(
                Alumno.builder()
                        .id(2)
                        .nombre("Paco")
                        .apellidos("paco")
                        .edad(23)
                        .email("paco@paco")
                        .build()

        );

        alumnos.add(
                Alumno.builder()
                        .id(3)
                        .nombre("Luis")
                        .apellidos("Luis")
                        .edad(23)
                        .email("Luis@Luis")
                        .build()

        );
    }
    public List<Alumno> findAll() {
        return Collections.unmodifiableList(alumnos);
    }

    public Optional<Alumno> findById(int id) {

        return alumnos.stream()
                .filter(a -> a.getId() == id)
                .findFirst();

    }

    public Alumno save(Alumno a) {
        alumnos.add(a);
        return a;
    }

    public Alumno edit(Alumno a) {
        int pos;
        if ((pos = indexOf(a.getId())) == -1) {
            return save(a);
        }
        else {
            return alumnos.set(pos, a);
        }
    }

    public void delete(Alumno a) {
        int pos;
        if ((pos = indexOf(a.getId())) != -1) {
            alumnos.remove(pos);
        }
    }

    private int indexOf(int id) {

        int pos = -1;

        for(int i = 0; i < alumnos.size() && pos == -1; i++) {
            if (alumnos.get(i).getId() == id)
                pos = i;
        }

        return pos;
    }

}
