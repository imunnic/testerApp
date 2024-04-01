package com.imunnic.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "abdominalesTGCF")
@DiscriminatorValue("ABDOMINALES-TGCF")
public class ExtensionesTronco extends Prueba {
  private final String nombre = "Extensiones de Tronco - TGCF";
  private final String descripcion = "Realizar el máximo de extensiones de tronco "
      + "partiendo desde la posición de decúbito supino con las piernas flexionadas"
      + " en un ángulo de 45º y las manos cruzadas tocando los hombros, en el tiempo"
      + " de 2 minutos. Se puntuará el doble del resultado."; 
  
  public ExtensionesTronco() {
    super();
    super.setNombre(nombre);
    super.setDescripcion(descripcion);
  }

  @Override
  public int getPuntuacion(Integer resultado) {
    return 2 * resultado;
  }

}
