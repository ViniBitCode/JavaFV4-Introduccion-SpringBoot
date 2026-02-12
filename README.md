# Java APP N4! - API REST | Sistema para Veterinaria!
💻 | Amigos de github, luego de realizar el curso de todocode de desarrollo de APIs, toco ponerlo en práctica!
💻 | Siendo la primera API REST que hago, hice junto a SpringBoot el CRUD para una clase "Animal" y otra "Duenio", relacionandolas a las 2 con la annotation @OneToOne!
💻 | Además, debí implementar 2 servicios gratuitos de hosting para que esto funcionara: uno para la BBDD y otro para la app dockerizada. 

### **Algunas otras cosas que me faltaron poner en el sistema:**
- Al ser una práctica de backend, en lo que son consultas no me faltó nada, si me falto alguna interfaz para enviar los datos.

### **Tecnicas/Tecnologias usadas para el proyecto que considero interesantes:**
- Backend: Java 21 con Spring Boot 4.0.2
- Persistencia: Spring Data JPA + MySQL 9.5.0
- Dockerización: Uso de Docker para la API.
- Hosting: Uso de Render para desplegar la API y uso de Clever Cloud para hostear la Base de datos.
- Herramienta: Uso de Maven para gestionar las dependencias.

### **Problemas técnicos solucionados:**
- Uso de variables de entorno: para no exponer datos sensibles, configure el proyecto para que tenga variables en las credenciales (username, password, y url) de la base de datos.
- Uso de OneToMany: Al hacer un GET de las mascotas y sus duenios, me encontré con un ciclo en la relación que lo pude solucionar con las annotations: @JsonManagedReference y @JsonBackReference.
- Dockerización: Para poder utilizar los servicios de Render y deployear la app, debí aprender Docker y cómo utilizarlo. 

# Cómo utilizar la API:
La URL de la que nacen los endpoints es esta: https://javafv4-introduccion-springboot.onrender.com/
Pueden probar haciendo las siguientes (en especial con ayuda de Postman):
- https://javafv4-introduccion-springboot.onrender.com/ejercicio2/duenio/traer_todos (GET)
- https://javafv4-introduccion-springboot.onrender.com/ejercicio2/duenio/agregar (POST)
- https://javafv4-introduccion-springboot.onrender.com/ejercicio2/duenio/editar/ (PUT)
- https://javafv4-introduccion-springboot.onrender.com//ejercicio2/duenio/eliminar/{id_eliminar} (DELETE)

## Ejemplo para POST:
{
    "dni": 10000000,
    "nombre": "nombre_duenio1",
    "apellido": "apellido_duenio1",
    "numero_celular": "1135611817"
}

  
# **Siguiente proyecto:**  
❇️ | El siguiente paso es la realziación de un proyecto más groso que proponen en la plataforma de TodoCode (de donde hice el curso de desarrollo ode APIs jeje).
Dejo link al proyecto N°5: [JavaFV5-]()
