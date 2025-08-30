package com.proyecto.redSocial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.redSocial.Entity.Comentario;
import com.proyecto.redSocial.Repository.ComentarioRepository;

@RestController
@RequestMapping("/comentario")
@CrossOrigin
public class ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    // GET: Buscar todos los comentarios
    @GetMapping(path = "/buscar")
    public List<Comentario> buscar() {
        return comentarioRepository.findAll();
    }

    // POST: Guardar un comentario
    @PostMapping(path = "/guardar")
    public Comentario guardar(@RequestBody Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    // DELETE: Eliminar un comentario por id
    @DeleteMapping(path = "/eliminar/{idcomentario}")
    public void eliminar(@PathVariable("idcomentario") Integer idcomentario) {
        Optional<Comentario> comentario = comentarioRepository.findById(idcomentario);
        comentario.ifPresent(c -> comentarioRepository.delete(c));
    }
}
