package com.gamje.cursos.model;

import lombok.Data;

@Data
public class Usuario {
    private int id;
    private String rol;
    private String rut;
    private String nombre;
    private String email;
    private String password;
}

