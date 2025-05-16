package com.gamje.cursos.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import com.gamje.cursos.model.Usuario;

@Component
public class UsuarioClient {

    private final WebClient webClient;

    public UsuarioClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081/usuarios").build(); // Puerto del MS usuarios
    }

    public Usuario obtenerUsuarioPorId(int id) {
        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Usuario.class)
                .block(); // Bloqueamos para obtener la respuesta sincronamente (en microservicios chicos es aceptable)
    }
}
