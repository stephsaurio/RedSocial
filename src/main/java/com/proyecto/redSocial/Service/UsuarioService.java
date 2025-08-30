package com.proyecto.redSocial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.redSocial.Entity.Usuario;
import com.proyecto.redSocial.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(path = "/buscar")
    public List<Usuario> buscar() {
        return usuarioRepository.findAll();
    }

    @PostMapping(path = "/guardar")
    public Usuario guardar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping(path = "/eliminar/{usuario}")
    public void eliminar(@PathVariable("usuario") String usuarioId) {
        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
        usuario.ifPresent(u -> usuarioRepository.delete(u));
    }
}


