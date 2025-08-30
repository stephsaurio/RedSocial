package com.proyecto.redSocial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.redSocial.Entity.Amistad;
import com.proyecto.redSocial.Repository.AmistadRepository;

@RestController
@RequestMapping("/amistad")
@CrossOrigin
public class AmistadService {

    @Autowired
    AmistadRepository amistadRepository;

    // GET: Buscar todas las amistades
    @GetMapping(path = "/buscar")
    public List<Amistad> buscar() {
        return amistadRepository.findAll();
    }

    // POST: Guardar una amistad
    @PostMapping(path = "/guardar")
    public Amistad guardar(@RequestBody Amistad amistad) {
        return amistadRepository.save(amistad);
    }

    // DELETE: Eliminar una amistad por id
    @DeleteMapping(path = "/eliminar/{idamistad}")
    public void eliminar(@PathVariable("idamistad") Integer idamistad) {
        Optional<Amistad> amistad = amistadRepository.findById(idamistad);
        amistad.ifPresent(a -> amistadRepository.delete(a));
    }
}
