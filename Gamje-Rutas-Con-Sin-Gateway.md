
# 📚 Gamje Microservicios - Uso con y sin Gateway

Este archivo describe cómo interactuar con cada microservicio de **Gamje**, tanto directamente como a través del **API Gateway**.

---

## 🌐 Gateway activo (`localhost:8300`)

Todos los servicios se acceden bajo el prefijo `/api`.

### 🧑‍🎓 Usuarios
- `GET  /api/usuarios`
- `POST /api/usuarios`

### 📚 Cursos
- `GET  /api/cursos`
- `POST /api/cursos`

### 📝 Inscripciones
- `GET  /api/inscripciones`
- `POST /api/inscripciones`
- `GET  /api/inscripciones/detalles`

### 💳 Pagos
- `GET  /api/pagos`
- `POST /api/pagos`
- `GET  /api/pagos/detalles`

---

## 🚫 Sin Gateway (acceso directo a microservicios)

### 🧑‍🎓 Usuarios (`localhost:8081`)
- `GET  http://localhost:8081/usuarios`
- `POST http://localhost:8081/usuarios`

### 📚 Cursos (`localhost:8099`)
- `GET  http://localhost:8099/cursos`
- `POST http://localhost:8099/cursos`

### 📝 Inscripciones (`localhost:8098`)
- `GET  http://localhost:8098/inscripciones`
- `POST http://localhost:8098/inscripciones`
- `GET  http://localhost:8098/inscripciones/detalles`

### 💳 Pagos (`localhost:8097`)
- `GET  http://localhost:8097/pagos`
- `POST http://localhost:8097/pagos`
- `GET  http://localhost:8097/pagos/detalles`

---

## ✅ Recomendación
Se recomienda usar el Gateway para mantener centralizado el acceso, controlar rutas, aplicar filtros y facilitar la integración con seguridad o balanceadores en producción.

