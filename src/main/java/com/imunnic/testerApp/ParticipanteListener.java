package com.imunnic.testerApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.imunnic.entidades.Participante;
import com.imunnic.repositorios.ParticipanteDao;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;

@Component
public class ParticipanteListener {
  private Logger log = LoggerFactory.getLogger(ParticipanteListener.class);
  private ParticipanteDao participanteDao;

  @Autowired
  private void init(ParticipanteDao participanteDao) {
    this.participanteDao = participanteDao;
  }
  
  @PostRemove
  public void postBorrar(Participante participante) {
      System.err.println("Se ha borrado al participante: " + participante.getPersona().getNombre());
  }

  @PostUpdate
  public void postActualizar(Participante participante) {
      System.err.println("Se ha actualizado al participante: " + participante.getPersona().getNombre());
  }
}
