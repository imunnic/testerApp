package com.imunnic.entidades;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("TGCF")
public class TestGeneral extends Competicion {
  private static final String NOMBRE = "Test General de la Condición Física";
  private static final String DESCRIPCION =
      "Test para evaluar la condición física de las FAS, teniendo en cuenta resistencia, "
          + "agilidad, fuerza de tren superior y fuerza de core";

  public TestGeneral() {
    super();
    setNombre(this.NOMBRE);
    setDescripcion(this.DESCRIPCION);
  }

  public TestGeneral(LocalDate fecha) {
    this();
    setFecha(fecha);
  }

  @Override
  public List<Participante> getClasificacion() {
    // TODO implementar método para clasificar a participantes en base a su puntuación
    return getParticipantes();
  }

}
