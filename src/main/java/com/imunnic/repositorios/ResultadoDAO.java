package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.Resultado;

@RepositoryRestResource(path = "resultados", itemResourceRel = "resultado", collectionResourceRel = "resultados")
public interface ResultadoDAO extends JpaRepository<Resultado, Long>{

}
