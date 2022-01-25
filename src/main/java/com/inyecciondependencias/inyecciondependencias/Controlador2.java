package com.inyecciondependencias.inyecciondependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class Controlador2 {

    @Autowired
    Servicio servicio;

    @GetMapping("/controlador2/getpersona")
    public Servicio getPersona(){
        servicio.devolverPersona();
        return servicio;
    }

    @GetMapping("/controlador2/getCiudad")
    public List<Ciudad> getCiudad(){
        return servicio.getCiudad();
    }

}
