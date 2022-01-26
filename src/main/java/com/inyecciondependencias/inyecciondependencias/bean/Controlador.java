package com.inyecciondependencias.inyecciondependencias.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador")
public class Controlador {


    @Autowired
    @Qualifier("bean1")
    Persona p1 ;



    @Autowired
    @Qualifier("bean2")
    Persona p2;

    @Autowired
    @Qualifier("bean3")
    Persona p3;

    @GetMapping("/bean/{bean}")
    public String sacarBean(@PathVariable String bean){

        switch (bean){
            case "bean1":
                return p1.getNombre();
            case "bean2":
                return p2.getNombre();
            case "bean3":
                return p3.getNombre();
            default:
                return null;
        }

    }
}
