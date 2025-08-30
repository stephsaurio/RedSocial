package com.proyecto.redSocial.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.redSocial.Entity.Interaccion;

@Repository("interaccionRepository")
public interface InteraccionRepository extends JpaRepository<Interaccion, Serializable> {

}
