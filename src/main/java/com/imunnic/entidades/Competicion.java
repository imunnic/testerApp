package com.imunnic.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPETICIONES")
public class Competicion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  @OneToMany(mappedBy = "competicion", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Participante> participantes;
  private LocalDate fecha;
  @ManyToMany
  @JoinTable(
      name = "competicion_juez",
      joinColumns = @JoinColumn(name = "competicion_id"),
      inverseJoinColumns = @JoinColumn(name = "juez_id")
  )
  private List<Persona> jueces;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public List<Participante> getParticipantes() {
    return participantes;
  }
  
  public List<Persona> getJueces() {
    return jueces;
  }
  
  public LocalDate getFecha() {
    return fecha;
  }
  
  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
  
  public Competicion() {
    participantes = new ArrayList<Participante>();
    jueces = new ArrayList<Persona>();
  }

  public Competicion(String nombre, List<Participante> participantes, LocalDate fecha) {
    this();
    setNombre(nombre);
    participantes.forEach(a -> addParticipante(a));
    setFecha(fecha);
  }
  
  public void addParticipante(Participante participante) {
    participantes.add(participante);
  }
  
  public void addParticipante(Persona juez) {
    jueces.add(juez);
  }
}
