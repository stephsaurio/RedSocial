package com.proyecto.redSocial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.redSocial.Entity.Interaccion;
import com.proyecto.redSocial.Repository.InteraccionRepository;

@RestController
@RequestMapping("/interaccion")
@CrossOrigin
public class InteraccionService {

    @Autowired
    InteraccionRepository interaccionRepository;

    // GET: Buscar todas las interacciones
    @GetMapping(path = "/buscar")
    public List<Interaccion> buscar() {
        return interaccionRepository.findAll();
    }

    // POST: Guardar una interaccion
    @PostMapping(path = "/guardar")
    public Interaccion guardar(@RequestBody Interaccion interaccion) {
        return interaccionRepository.save(interaccion);
    }

    // DELETE: Eliminar una interaccion por id
    @DeleteMapping(path = "/eliminar/{idinteraccion}")
    public void eliminar(@PathVariable("idinteraccion") Integer idinteraccion) {
        Optional<Interaccion> interaccion = interaccionRepository.findById(idinteraccion);
        interaccion.ifPresent(i -> interaccionRepository.delete(i));
    }
}

