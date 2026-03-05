# Sistema de Exámenes - Backend 🚀

Este proyecto es el backend de una plataforma de gestión de exámenes en tiempo real, desarrollado con **Spring Boot 2.6.6** y **Java 8**. Incluye seguridad basada en **JWT** y está completamente containerizado para un despliegue rápido.

## Stack Tecnológico

*   **Java**: 1.8 (Java 8)
*   **Framework**: Spring Boot 2.6.6
*   **Seguridad**: Spring Security + JSON Web Token (JJWT 0.9.1)
*   **Persistencia**: Spring Data JPA + MySQL Connector
*   **Base de Datos**: MySQL 8.0 (vía Docker)
*   **Herramienta de Construcción**: Maven

## Infraestructura con Docker

El proyecto utiliza **Docker Compose** para levantar tanto la base de datos como la aplicación de forma automática.

### Requisitos
*   Docker y Docker Desktop instalados.
*   Archivo `.env` en la raíz con las credenciales configuradas.

### Despliegue
Para compilar el proyecto y levantar los servicios, ejecuta:
```bash
docker-compose up -d --build

Acceso a los Servicios
API REST: http://localhost:8085
Base de Datos (Externa): localhost:3310 (Usuario: root)


Endpoints de Seguridad
Método	Endpoint	Descripción
POST	/generate-token	Envía credenciales para recibir un Token JWT.
GET	/actual-usuario	Retorna el usuario logueado actualmente.
POST	/usuarios/	Registro de nuevos usuarios (Público).


Configuración del Proyecto (pom.xml)
El proyecto gestiona las dependencias críticas mediante Maven:
jjwt: Para la generación y validación de tokens.
jaxb-api: Necesario para la compatibilidad de tokens en versiones recientes de Java.
devtools: Para recarga en caliente durante el desarrollo.
 Notas de Desarrollo
El puerto interno del contenedor es el 8080, mapeado al 8085 para el exterior.
Se utiliza la política de update en Hibernate para la creación automática de tablas en MySQL.