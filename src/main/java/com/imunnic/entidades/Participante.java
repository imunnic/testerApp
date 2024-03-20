package com.imunnic.entidades;


import java.util.ArrayList;
import java.util.List;
import com.imunnic.testerApp.ParticipanteListener;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@EntityListeners(ParticipanteListener.class)
@Table(name = "PARTICIPANTES")
public class Participante{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique=true)
  private Long id;
  private int dorsal;
  @ManyToOne
  @JoinColumn(name = "persona_id")
  private Persona persona;
  @OneToMany(cascade = CascadeType.ALL, targetEntity = Resultado.class, mappedBy = "participante")
  private List<Resultado> resultados;
  @ManyToOne
  @JoinColumn(name = "competicion_id")
  private Competicion competicion;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public int getDorsal() {
    return dorsal;
  }
  
  public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
  }
  
  public List<Resultado> getResultados() {
    return resultados;
  }

  public Persona getPersona() {
    return persona;
  }
  
  public void setPersona(Persona persona) {
    this.persona = persona;
  }
  
  public Competicion getCompeticion() {
    return competicion;
  }
  
  public void setCompeticion(Competicion competicion) {
    this.competicion = competicion;
  }
  
  public Participante() {
    resultados = new ArrayList<Resultado>();
  }

  public Participante(Persona persona, Competicion competicion, int dorsal) {
    this();
    setPersona(persona);
    setDorsal(dorsal);
    setCompeticion(competicion);
  }

  public void addResultado(Resultado resultado) {
    resultado.setParticipante(this);
    getResultados().add(resultado);
  }

}
