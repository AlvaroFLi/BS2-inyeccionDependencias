package com.inyecciondependencias.inyecciondependencias.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Service
public class Persona {

    private String nombre;

    @Qualifier("bean1")
    public void bean1(){  setNombre("bean1"); }

    @Bean("bean2")
    public void bean2(){
        setNombre("bean2");
    }

    @Bean("bean3")
    public void bean3(){
        setNombre("bean3");
    }


}
