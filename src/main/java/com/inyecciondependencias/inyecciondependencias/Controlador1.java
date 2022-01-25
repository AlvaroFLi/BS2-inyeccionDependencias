package com.inyecciondependencias.inyecciondependencias;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController()
@Service
public class Controlador1 {

    Persona p = new Persona();

    @GetMapping("/controlador1/addPersona/{nombre}/{poblacion}/{edad}")
    public  Persona addPersona(@PathVariable String nombre, @PathVariable("poblacion") String poblacion, @PathVariable("edad") int edad){

            p.setNombre(nombre);
            p.setPoblacion(poblacion);
            p.setEdad(edad);
            return p;
    }

    public int getEdad(){
        return p.getEdad();
    }

    public void setEdad(int edad){
        p.setEdad(edad);
    }


}
