package com.imunnic.entidades;


import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "PARTICIPANTES")
public class Participante implements Puntuable<Resultado>, Identificable<Long> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "personaId")
  private Persona persona;
  @OneToMany(mappedBy = "participante")
  private List<Resultado> resultados;
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "competicion")
  private Competicion competicion;
  private int dorsal;

  public Persona getPersona() {
    return persona;
  }

  public void setPersona(Persona persona) {
    this.persona = persona;
  }

  public List<Resultado> getResultados() {
    return resultados;
  }

  public void setResultados(List<Resultado> resultados) {
    this.resultados = resultados;
  }

  public int getDorsal() {
    return dorsal;
  }

  public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public int getPuntuacion(Resultado resultado) {
    // TODO algoritmo de puntuacion
    return 0;
  }

  public Competicion getCompeticion() {
    return competicion;
  }

  public void setCompeticion(Competicion competicion) {
    this.competicion = competicion;
  }

  public Participante() {
    this.resultados = new ArrayList<Resultado>();
  }

  public Participante(Persona persona, List<Resultado> resultados, int dorsal, Competicion competicion) {
    setPersona(persona);
    setResultados(resultados);
    setDorsal(dorsal);
    setCompeticion(competicion);
  }

  public void anadirResultado(Resultado resultado) {
    this.resultados.add(resultado);
  }
}
