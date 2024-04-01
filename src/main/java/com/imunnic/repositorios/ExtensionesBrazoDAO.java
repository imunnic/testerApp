package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.ExtensionesBrazo;

@RepositoryRestResource(path="flexiones", itemResourceRel = "flexion", collectionResourceRel = "flexiones")
public interface ExtensionesBrazoDAO extends JpaRepository<ExtensionesBrazo, Integer>{

}
