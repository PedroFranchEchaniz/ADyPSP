package com.salesianos.Ejercicio.RuizFran_FranchPedro.Repositorio;

import com.salesianos.Ejercicio.RuizFran_FranchPedro.Clases.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository <Producto, Long> {
}
