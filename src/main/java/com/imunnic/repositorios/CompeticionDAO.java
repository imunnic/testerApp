package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.Competicion;

@RepositoryRestResource(path = "competiciones", itemResourceRel = "competicion", collectionResourceRel = "competiciones")
public interface CompeticionDAO extends JpaRepository<Competicion, Long>{

}
