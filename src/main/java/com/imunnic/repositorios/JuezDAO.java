package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.Juez;

@RepositoryRestResource(path = "jueces", itemResourceRel = "juez", collectionResourceRel = "jueces")
public interface JuezDAO extends JpaRepository<Juez, Long>{

}
