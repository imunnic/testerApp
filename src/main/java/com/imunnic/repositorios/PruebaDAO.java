package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.Prueba;

@RepositoryRestResource(path="pruebas", itemResourceRel = "prueba", collectionResourceRel = "pruebas")
public interface PruebaDAO extends JpaRepository<Prueba, Integer> {

}
