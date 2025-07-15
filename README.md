# 📅 API Festivos - Simulado

Aplicación fullstack que permite consultar si una fecha es festiva y visualizar un listado de festivos simulados. Este proyecto fue construido con Angular (frontend) y Spring Boot (backend), usando una lógica sin conexión a base de datos (mock).

---

## 🔧 Tecnologías utilizadas

| Backend             | Frontend       |
|---------------------|----------------|
| Java 21             | Angular 17     |
| Spring Boot 3.2.5   | TypeScript     |
| Spring Web          | RxJS           |
| Spring Data (fake)  | Bootstrap (UI) |
| Maven               | Angular CLI    |

---

## 🎯 Funcionalidades principales

- 🔍 **Verificar si una fecha es festiva** mediante el endpoint `/verificar?fecha=YYYY-MM-DD`.
- 📆 **Listar todos los días festivos simulados**.
- 💡 Simulación de lógica de negocio sin persistencia real.
- 💻 Interfaz gráfica amigable en Angular.

---

## 🗂 Estructura del proyecto

```
📦 api-festivos-simulado
├── backend-festivos
│   └── src/main/java/com/example/festivos/
│       ├── Festivo.java
│       ├── Tipo.java
│       ├── FestivoController.java
│       ├── FakeFestivoRepository.java
│       └── FestivosApplication.java
│
└── frontend-festivos
    └── src/app/
        ├── app.component.ts
        ├── app.component.html
        ├── festivo.service.ts
        └── ...
```

---

## 👥 Integrantes del proyecto

| Nombre               | Rol                   |
|----------------------|------------------------|
| Jeremías Palacio     | Arquitecto Fullstack   |
| [Nombre integrante 2] | Frontend Developer     |
| [Nombre integrante 3] | Backend Developer      |

> 💡 Puedes modificar esta tabla según tu equipo.

---

## 🚀 Cómo ejecutar el proyecto

### 🔙 Backend (Spring Boot)

1. Ir a la carpeta `backend-festivos`
2. Ejecutar el proyecto con Maven:

```bash
mvn spring-boot:run
```

El backend iniciará en: `http://localhost:8080`

---

### 🔜 Frontend (Angular)

1. Ir a la carpeta `frontend-festivos`
2. Instalar dependencias:

```bash
npm install
```

3. Ejecutar el servidor:

```bash
ng serve
```

La app estará disponible en: `http://localhost:4200`

---

## 🔗 Endpoints API

| Método | Endpoint               | Descripción                        |
|--------|------------------------|------------------------------------|
| GET    | `/listar`              | Retorna todos los festivos         |
| GET    | `/verificar?fecha=...` | Verifica si una fecha es festiva   |

---

## 📝 Licencia

Este proyecto fue desarrollado con fines educativos y puede ser reutilizado para prácticas académicas o personales.

---

## 🎓 Créditos

Hecho con ❤️ por estudiantes apasionados por la tecnología y la arquitectura de software moderna.
