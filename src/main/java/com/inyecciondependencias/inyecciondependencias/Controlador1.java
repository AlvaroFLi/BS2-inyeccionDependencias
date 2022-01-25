package com.inyecciondependencias.inyecciondependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {

    @Autowired
    Servicio servicio;

    @GetMapping("/controlador1/addPersona/{nombre}/{poblacion}/{edad}")
    public  Servicio addPersona(@PathVariable String nombre, @PathVariable("poblacion") String poblacion, @PathVariable("edad") int edad){

            servicio.crearPersona(nombre, poblacion, edad);
            return servicio;
    }


    @PostMapping("/controlador1/addCiudad")
    public Ciudad addCiudad(@RequestBody Ciudad ciudad){
        servicio.addCiudad(ciudad);
        return ciudad;
    }


}
