package com.imunnic.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ABDOMINALES")
public class PruebaAbdominales extends Prueba {

  public PruebaAbdominales() {
    setNombre("Extensiones de tronco");
    setDescripcion(
        "Realizar extensiones de tronco con los pies sujetos al suelo y las piernas con una flexión "
        + "de 45º aprox durante 2 min hasta el fallo. La puntuación será el total "
        + "de extensiones de tronco");
  }

  @Override
  public int getTipo() {
    return 2;
  }

}
