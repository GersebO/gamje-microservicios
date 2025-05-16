package com.gamje.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gamje.cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
