package com.imunnic.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FLEXIONES")
public class PruebaFlexiones extends Prueba{
  
  public PruebaFlexiones() {
   setNombre("Extensiones de brazos");
   setDescripcion("Realizar extensiones de brazos durante un minuto hasta el fallo. La puntuación será el total de las flexiones");
  }

  @Override
  public int getTipo() {
    // TODO Auto-generated method stub
    return 1;
  }

}
