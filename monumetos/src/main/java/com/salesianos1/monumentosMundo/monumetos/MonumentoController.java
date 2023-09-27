package com.salesianos1.monumentosMundo.monumetos;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepositorio monumento;

    @GetMapping('/monumento/')
    public ResponseEntity<List<Monumento>> getAll(){
        List<Monumento> monumetosList = monumento.findAll();

        if(monumetosList.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(monumetosList);
    }

    @GetMapping('/monumento/{id}')
    public ResponseEntity<Monumento> findById(@PathVariable Long id){
        return ResponseEntity.of(monumento.findById(id));
    }

    @PostMapping('/monumento/')
    public ResponseEntity<Monumento> createMonumento (@RequestBody Monumento monumentoNuevo){
        Monumento nuevoMonumento = monumento.save(monumentoNuevo);
        return ResponseEntity.status(201).body(nuevoMonumento);
    }

@PutMapping('/monumento/{id}')
    public ResponseEntity<Monumento> editMonumento (@PathVariable Long id, @RequestBody Monumento esteMonumento){
    return ResponseEntity.of(monumento.findById(id)
            .map(
                monumentoAntiguo -> {
                    monumentoAntiguo.setId(esteMonumento.getId());
                    monumentoAntiguo.setNombre(esteMonumento.getNombre());
                    monumentoAntiguo.setCiudad(esteMonumento.getCiudad());
                    monumentoAntiguo.setCodigo(esteMonumento.getCodigo());
                    monumentoAntiguo.setPais(esteMonumento.getPais());
                    return monumento.save(monumentoAntiguo);

                }));
}

@DeleteMapping('/monumento/{id}')
    public ResponseEntity<Monumento> deleteMonumento (@PathVariable Long id){
        if(monumento.existsById(id))
            monumento.deleteById(id);

}


}
