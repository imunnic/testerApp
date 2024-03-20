package com.imunnic.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MixIns {
  
  public static interface Participantes{
    //Cambia el atributo dorsal a numDorsal
    @JsonProperty("numDorsal")
    int getDorsal();
    @JsonProperty("otro")
    default int getOtro() {
      return 1;
    }
  }

}
