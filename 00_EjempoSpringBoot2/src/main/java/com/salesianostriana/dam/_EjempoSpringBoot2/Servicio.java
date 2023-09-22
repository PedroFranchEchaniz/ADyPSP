package com.salesianostriana.dam._EjempoSpringBoot2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Servicio {

    private final Componente componente;
    private final Componente2 componente2;

    public void saludos(){
        componente.print();
        componente2.print();
    }

}
