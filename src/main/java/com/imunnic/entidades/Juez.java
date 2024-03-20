package com.imunnic.entidades;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "JUECES")
@DiscriminatorValue("JUEZ")
public class Juez extends Persona{
  @ManyToMany(mappedBy = "jueces")
  private List<Competicion> competiciones;
  
  public List<Competicion> getCompeticiones() {
    return competiciones;
  }
  
  public Juez() {
    super();
    competiciones = new ArrayList<>();
  }
  
  public Juez(String nombre, String apellido1, String apellido2) {
    this();
    setNombre(nombre);
    setApellido1(apellido1);
    setApellido2(apellido2);
  }
  
  public void addCompeticiones(Competicion competicion) {
    getCompeticiones().add(competicion);
  }

}
