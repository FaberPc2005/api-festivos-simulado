# 📅 API Festivos - Simulado

## 🔧 Tecnologías utilizadas

| Backend             | Frontend       |
|---------------------|----------------|
| Java 21             | Angular 17     |
| Spring Boot 3.2.5   | TypeScript     |
| Maven               | Angular CLI    |

---

## 🎯 Funcionalidades principales

- 🔍 **Verificar si una fecha es festiva** mediante el endpoint `/verificar?fecha=YYYY-MM-DD`.
- 📆 **Listar todos los días festivos simulados**.


## 👥 Integrantes del proyecto

| Nombre                    |
|---------------------------|
| Maria Isabel Trejos Largo |
| Faber Josue Palacio Cuyan |

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

