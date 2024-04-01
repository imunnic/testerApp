package com.imunnic.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "PERSONAS")
public class Persona implements Identificable<Long> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String dni;
  private String nombre;
  private String apellido1;
  private String apellido2;
  
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
  
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public Long getId() {
    return this.id;
  }
  
  public String getDni() {
    return dni;
  }
  
  public void setDni(String dni) {
    this.dni = dni;
  }
  
  public Persona() {
  }
  
  public Persona(String nombre, String apellido1, String apellido2, String dni) {
    setNombre(nombre);
    setApellido1(apellido1);
    setApellido2(apellido2);
    setDni(dni);
  }

}
