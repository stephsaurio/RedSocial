package com.proyecto.redSocial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.redSocial.Entity.Publicacion;
import com.proyecto.redSocial.Repository.PublicacionRepository;

@RestController
@RequestMapping("/publicacion")
@CrossOrigin
public class PublicacionService {

    @Autowired
    PublicacionRepository publicacionRepository;

    // GET: Buscar todas las publicaciones
    @GetMapping(path = "/buscar")
    public List<Publicacion> buscar() {
        return publicacionRepository.findAll();
    }

    // POST: Guardar una publicación
    @PostMapping(path = "/guardar")
    public Publicacion guardar(@RequestBody Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    // DELETE: Eliminar una publicación por id
    @DeleteMapping(path = "/eliminar/{idpublicacion}")
    public void eliminar(@PathVariable("idpublicacion") Integer idpublicacion) {
        Optional<Publicacion> publicacion = publicacionRepository.findById(idpublicacion);
        publicacion.ifPresent(p -> publicacionRepository.delete(p));
    }
}

