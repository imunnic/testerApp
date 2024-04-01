package com.imunnic.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity(name = "COMPETICIONES")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO")
public abstract class Competicion implements Identificable<Integer>, ConFecha {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nombre;
  private String descripcion;
  private LocalDate fecha;
  @ManyToMany(mappedBy = "competicionesJuez")
  private List<Juez> jueces;
  @OneToMany(mappedBy = "competicion")
  private List<Participante> participantes;
  @ManyToMany
  @JoinTable(
      name = "competicion_pruebas",
      joinColumns = @JoinColumn(name = "competicion_id"),
      inverseJoinColumns = @JoinColumn(name = "prueba_id")
  )
  private List<Prueba> pruebas;
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public List<Juez> getJueces() {
    return jueces;
  }
  
  public void setJueces(List<Juez> jueces) {
    this.jueces = jueces;
  }
  
  public List<Participante> getParticipantes() {
    return participantes;
  }
  
  public void setParticipantes(List<Participante> participantes) {
    this.participantes = participantes;
  }
  
  @Override
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  @Override
  public LocalDate getFecha() {
    return fecha;
  }
  
  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
  
  public List<Prueba> getPruebas() {
    return pruebas;
  }
  
  public void setPruebas(List<Prueba> pruebas) {
    this.pruebas = pruebas;
  }
  
  public Competicion() {
    this.jueces = new ArrayList<Juez>();
    this.participantes = new ArrayList<Participante>();
    this.pruebas = new ArrayList<Prueba>();
  }

  public Competicion(String nombre, String descripcion, LocalDate fecha) {
    setNombre(nombre);
    setDescripcion(descripcion);
    setFecha(fecha);
  }
  
  public void anadirParticipante(Participante participante) {
    this.participantes.add(participante);
  }

  public void anadirJuez(Juez juez) {
    this.jueces.add(juez);
  }
  
  public void anadirPrueba(Prueba prueba) {
    this.pruebas.add(prueba);
  }
  
  public abstract List<Participante> getClasificacion();
  
}
