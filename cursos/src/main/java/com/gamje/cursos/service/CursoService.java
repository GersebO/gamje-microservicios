package com.gamje.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.gamje.cursos.model.Curso;
import com.gamje.cursos.repository.CursoRepository;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> obtenerPorId(int idCurso) {
        return cursoRepository.findById(idCurso);
    }

    public void eliminar(int idCurso) {
        cursoRepository.deleteById(idCurso);
    }
}