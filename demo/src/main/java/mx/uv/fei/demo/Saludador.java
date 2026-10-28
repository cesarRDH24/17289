package mx.uv.fei.demo;

import jakarta.persistence.Entity;

@Entity
public class Saludador {
    private String contenido;

    public String getContenido(){
        return contenido;
    }

    public Saludador(String contenido){
        this.contenido=contenido;
    }
}
