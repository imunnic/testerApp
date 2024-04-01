package com.imunnic.entidades;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "JUECES")
public class Juez implements Identificable<Long>{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "personaId", referencedColumnName = "id")
  private Persona persona;
  @ManyToMany
  @JoinTable(
      name = "juecesCompeticion",
      joinColumns = @JoinColumn(name = "juezId"),
      inverseJoinColumns = @JoinColumn(name = "competicionId"))
  private List<Competicion> competicionesJuez;
  @OneToMany(mappedBy = "juez", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Resultado> resultados;
  
  @Override
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Persona getPersona() {
    return persona;
  }
  
  public void setPersona(Persona persona) {
    this.persona = persona;
  }
  
  public List<Competicion> getCompeticiones() {
    return competicionesJuez;
  }
  
  public void setCompeticiones(List<Competicion> competiciones) {
    this.competicionesJuez = competiciones;
  }
  
  public List<Resultado> getResultados() {
    return resultados;
  }
  
  public void setResultados(List<Resultado> resultados) {
    this.resultados = resultados;
  }
  
  public Juez() {
    this.competicionesJuez = new ArrayList<Competicion>();
    this.resultados = new ArrayList<Resultado>();
  }

  public Juez(Persona persona, List<Competicion> competiciones) {
    this();
    setPersona(persona);
    setCompeticiones(competiciones);
  }
  
  
  
}
