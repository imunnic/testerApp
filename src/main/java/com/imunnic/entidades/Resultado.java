package com.imunnic.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESULTADOS")
public class Resultado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int resultado;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PARTICIPANTE")
  private Participante participante;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public int getResultado() {
    return resultado;
  }
  
  public void setResultado(int resultado) {
    this.resultado = resultado;
  }
  
  public Participante getParticipante() {
    return participante;
  }
  
  public void setParticipante(Participante participante) {
    this.participante = participante;
  }

  public Resultado() {
  }
  
  public Resultado(int resultado, Participante participante) {
    setResultado(resultado);
    setParticipante(participante);
  }

}
