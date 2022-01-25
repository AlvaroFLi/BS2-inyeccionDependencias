package com.inyecciondependencias.inyecciondependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador2 {

    @Autowired
    Controlador1 p;

    @GetMapping("/controlador2/getpersona")
    public Controlador1 getPersona(){
        int edadAntes = p.getEdad();
        int edadDespues = edadAntes * 2;
        p.setEdad(edadDespues);
        return p;
    }

}
