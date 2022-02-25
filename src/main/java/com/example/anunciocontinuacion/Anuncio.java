package com.example.anunciocontinuacion;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;


@Data
@NoArgsConstructor
public class Anuncio {
    private long id = -1;
    private String nombre;
    private String asunto;
    private String comentario;

    public Anuncio(String nombre, String asunto, String comentario) {
        this.nombre = nombre;
        this.asunto = asunto;
        this.comentario = comentario;
    }
}
