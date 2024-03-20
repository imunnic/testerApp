package com.imunnic.entidades;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PERSONAS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="TIPO")
@DiscriminatorValue("PERSONA")
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String apellido1;
  private String apellido2;
  @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Participante> participantes;

  
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
  
  public String getApellido1() {
    return apellido1;
  }
  
  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }
  
  public String getApellido2() {
    return apellido2;
  }
  
  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }
  
  public List<Participante> getParticipantes() {
    return participantes;
  }
  
  public Persona() {
    participantes = new ArrayList<>();
  }
  
  public Persona(String nombre, String apellido1, String apellido2) {
    this();
    setNombre(nombre);
    setApellido1(apellido1);
    setApellido2(apellido2);
  }
  
  public void addParticipante(Participante participante) {
    participantes.add(participante);
  }

}
