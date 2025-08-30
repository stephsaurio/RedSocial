package com.proyecto.redSocial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.redSocial.Entity.Administrador;
import com.proyecto.redSocial.Repository.AdministradorRepository;

@RestController
@RequestMapping("/administrador")
@CrossOrigin
public class AdministradorService {

    @Autowired
    AdministradorRepository administradorRepository;

    // GET: Buscar todos los administradores
    @GetMapping(path = "/buscar")
    public List<Administrador> buscar() {
        return administradorRepository.findAll();
    }

    // POST: Guardar un administrador
    @PostMapping(path = "/guardar")
    public Administrador guardar(@RequestBody Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    // DELETE: Eliminar un administrador por id
    @DeleteMapping(path = "/eliminar/{idadministrador}")
    public void eliminar(@PathVariable("idadministrador") Integer idadministrador) {
        Optional<Administrador> administrador = administradorRepository.findById(idadministrador);
        if (administrador.isPresent()) {
            administradorRepository.delete(administrador.get());
        }
    }
}
