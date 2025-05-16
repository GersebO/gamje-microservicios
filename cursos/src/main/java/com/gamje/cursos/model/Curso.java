package com.gamje.cursos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(nullable = false)
    private String nombreCurso;

    @Column(nullable = false)
    private String descripcionCurso;

    @Column(nullable = false)
    private String docenteCurso;

    @Column(nullable = false)
    private String duracionCurso;
}
