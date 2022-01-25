package com.inyecciondependencias.inyecciondependencias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
public class Persona {
    String nombre;
    String poblacion;
    int edad;

    public Persona() {

    }
}
