package com.imunnic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.imunnic.entidades.Participante;

@RepositoryRestResource(path = "participantes", itemResourceRel = "participante", collectionResourceRel = "participantes")
public interface ParticipanteDao extends JpaRepository<Participante, Long>{

}
