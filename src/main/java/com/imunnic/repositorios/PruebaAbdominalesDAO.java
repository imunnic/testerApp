package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.PruebaAbdominales;

@RepositoryRestResource(path = "pruebasAbdominales", itemResourceRel = "pruebaAbdominales", collectionResourceRel = "pruebasAbdominales")
public interface PruebaAbdominalesDAO extends JpaRepository<PruebaAbdominales, Integer> {

}
