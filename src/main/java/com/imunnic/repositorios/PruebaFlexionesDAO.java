package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.PruebaFlexiones;

@RepositoryRestResource(path = "pruebasFlexiones", itemResourceRel = "pruebaFlexiones", collectionResourceRel = "pruebasFlexiones")
public interface PruebaFlexionesDAO extends JpaRepository<PruebaFlexiones, Integer> {

}
