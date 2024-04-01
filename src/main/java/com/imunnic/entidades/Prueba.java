package com.imunnic.entidades;


import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity(name = "PRUEBAS")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"TIPO"}, name = "tipo_unico"))
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO")
@DiscriminatorValue(value = "NONE")
public abstract class Prueba implements Identificable<Integer>, Puntuable<Integer>{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nombre;
  private String descripcion;
  @ManyToMany(mappedBy = "pruebas")
  private List<Competicion> competiciones;
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  @Override
  public Integer getId() {
    return id;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public List<Competicion> getCompeticiones() {
    return competiciones;
  }
  
  public void setCompeticiones(List<Competicion> competiciones) {
    this.competiciones = competiciones;
  }
  
  public Prueba(){
    setCompeticiones(new ArrayList<Competicion>());
  }

}
