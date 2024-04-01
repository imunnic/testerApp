package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.TestGeneral;

@RepositoryRestResource(path = "testsGenerales", itemResourceRel = "test", collectionResourceRel = "tests")
public interface TestGeneralDAO extends JpaRepository<TestGeneral, Integer> {

}
