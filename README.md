
# 🎓 Gamje - Plataforma Educativa Microservicios

**Gamje** es un equipo de desarrollo de software. el cual esta realizando un proyecto hacia la empresa edutech. El proyecto es una plataforma educativa modular el cual esta construida en una arquitectura monilitica.El equipo de Gamje ha decidido realizar una migracion hacia una arquitectura de microservicios utilizando Spring Boot, WebClient, y un API Gateway centralizado.

---

## 📦 Microservicios implementados

| Microservicio   | Puerto | Descripción                                         |
|------------------|--------|----------------------------------------------------|
| Usuarios         | 8081   | Registro y gestión de usuarios (rol, email, RUT)   |
| Cursos           | 8099   | Administración de cursos, docentes y duración      |
| Inscripciones    | 8098   | Vinculación de usuarios a cursos                   |
| Pagos            | 8097   | Registro de pagos por curso y usuario              |
| Gateway          | 8300   | Entrada central para acceder a todos los servicios |

---

## 🌐 Acceso vía Gateway

El API Gateway enruta todas las solicitudes bajo el prefijo `/api`.

Ejemplos:
- `GET  http://localhost:8300/api/usuarios`
- `POST http://localhost:8300/api/pagos`

---

## 🔧 Tecnologías usadas

- Java 17+
- Spring Boot 3.3.11
- Spring Cloud Gateway
- Spring WebClient (para comunicación entre MS)
- Spring Data JPA + MySQL
- Lombok
- Postman (para pruebas)
- Maven

---

## 🧪 Cómo ejecutar localmente

1. Clona este repositorio y entra a la carpeta raíz:

```bash
git clone https://github.com/tu-usuario/gamje-microservicios.git
cd gamje-microservicios
```

2. Asegúrate de tener **MySQL** corriendo y crea las siguientes bases de datos:

- `servicio_usuario`
- `servicio_curso`
- `servicio_inscripcion`
- `servicio_pago`

3. Desde cada carpeta de microservicio:

```bash
mvn spring-boot:run
```

4. Inicia el gateway:

```bash
cd gateway
mvn spring-boot:run
```

---

## 📫 Endpoints útiles

| Servicio     | URL Gateway                           |
|--------------|----------------------------------------|
| Usuarios     | `http://localhost:8300/api/usuarios`   |
| Cursos       | `http://localhost:8300/api/cursos`     |
| Inscripciones| `http://localhost:8300/api/inscripciones` |
| Pagos        | `http://localhost:8300/api/pagos`      |

---

## 👨‍💻 Autor
Proyecto desarrollado como parte del curso de Desarrollo Fullstack I (DSY1104).
