package com.inyecciondependencias.inyecciondependencias;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {

    Persona person = new Persona();

    List<Ciudad> listaCiudad = new ArrayList<>();

    public Persona crearPersona(String nombre,String ciudad,int edad){
        person.setEdad(edad);
        person.setNombre(nombre);
        person.setPoblacion(ciudad);
        return person;
    }

    public Persona devolverPersona(){
        int antes = person.getEdad();
        int despues = antes *2;
        person.setEdad(despues);
        return  person;
    }

    public String addCiudad(Ciudad ciudad){
        listaCiudad.add(ciudad);
        return "ciudad añadida";
    }

    public List<Ciudad> getCiudad(){
        return listaCiudad;
    }




}
