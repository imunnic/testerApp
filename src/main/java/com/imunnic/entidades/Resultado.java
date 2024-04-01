package com.imunnic.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "RESULTADOS")
public class Resultado implements Identificable<Long>{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "participanteId")
  private Participante participante;
  @ManyToOne
  @JoinColumn(name = "juezId")
  private Juez juez;
  @ManyToOne
  @JoinColumn(name = "pruebaId")
  private Prueba prueba;
  private int marca;

  @Override
  public Long getId() {
    // TODO Auto-generated method stub
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Participante getParticipante() {
    return participante;
  }
  
  public void setParticipante(Participante participante) {
    this.participante = participante;
  }
  
  public Juez getJuez() {
    return juez;
  }
  
  public void setJuez(Juez juez) {
    this.juez = juez;
  }
  
  public Prueba getPrueba() {
    return prueba;
  }
  
  public void setPrueba(Prueba prueba) {
    this.prueba = prueba;
  }
  
  public int getMarca() {
    return marca;
  }
  
  public void setMarca(int marca) {
    this.marca = marca;
  }
  
  public Resultado() {
  }

  public Resultado(Participante participante, Juez juez, Prueba prueba, int marca) {
    setParticipante(participante);
    setJuez(juez);
    setPrueba(prueba);
    setMarca(marca);
  }
  
  

}
