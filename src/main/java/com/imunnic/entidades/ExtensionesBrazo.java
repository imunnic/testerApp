package com.imunnic.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "FlexionesTGCF")
@DiscriminatorValue("FLEXIONES-TGCF")
public class ExtensionesBrazo extends Prueba {
  private final String nombre = "Extensiones de brazo - TGCF";
  private final String descripcion = "Realizar el máximo de extensiones de brazo con las manos a la"
      + " altura de los hombros, partiendo desde posición tendido supino, en el tiempo de 1 minuto"
      + " con una parada como máximo. Se puntuará el doble del resultado"; 
  
  public ExtensionesBrazo() {
    super();
    super.setNombre(nombre);
    super.setDescripcion(descripcion);
  }

  @Override
  public int getPuntuacion(Integer resultado) {
    return 2 * resultado;
  }

}
