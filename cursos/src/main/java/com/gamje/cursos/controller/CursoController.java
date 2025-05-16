package com.gamje.cursos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gamje.cursos.model.Curso;
import com.gamje.cursos.model.Usuario;
import com.gamje.cursos.service.CursoService;
import com.gamje.cursos.client.UsuarioClient;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;
    private final UsuarioClient usuarioClient;

    public CursoController(CursoService cursoService, UsuarioClient usuarioClient) {
        this.cursoService = cursoService;
        this.usuarioClient = usuarioClient;
    }

    @PostMapping
    public ResponseEntity<?> crearCurso(@RequestBody Curso curso) {
        Curso nuevoCurso = cursoService.guardar(curso);
        return ResponseEntity.ok(nuevoCurso);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> obtenerTodos() {
        return ResponseEntity.ok(cursoService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerCursoPorId(@PathVariable int id) {
        Optional<Curso> curso = cursoService.obtenerPorId(id);
        return curso.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarCurso(@PathVariable int id) {
        cursoService.eliminar(id);
        return ResponseEntity.ok("Curso eliminado correctamente.");
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable int id) {
        Usuario usuario = usuarioClient.obtenerUsuarioPorId(id);
        return ResponseEntity.ok(usuario);
    }
}