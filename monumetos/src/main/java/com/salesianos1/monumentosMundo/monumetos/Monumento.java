package com.salesianos1.monumentosMundo.monumetos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Monumento {
    private Long id;
    private String codigo;
    private String pais;
    private  String ciudad;
    private Map localizacion;
    private String nombre;
    private String descripcion;
    private String url;

}
