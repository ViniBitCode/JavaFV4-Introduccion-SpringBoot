/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.controller;

import com.example4.__SpringBoot_Ejercicio2.model.Duenio;
import com.example4.__SpringBoot_Ejercicio2.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService duenioService;

    @GetMapping("/ejercicio2/duenio/traer_por_id/{id_duenio}")
    public Duenio traerPersonaPorID(@PathVariable Long id_duenio) {
        return duenioService.buscarDuenioPorId(id_duenio);
    }

    @GetMapping("/ejercicio2/duenio/traer_todos")
    public List<Duenio> traerDuenios() {

        return duenioService.obtenerDuenios();

    }

    @PostMapping("/ejercicio2/duenio/agregar")
    public String agregarPersona(@RequestBody Duenio duenio) {
        duenioService.crearDuenio(duenio);
        return "Se crea un duenio con ID: " + duenio.getId_duenio();
    }

    @PutMapping("/ejercicio2/duenio/editar/{id_viejo}")
    public Duenio editarPersona(@PathVariable Long id_viejo,
            @RequestParam(required = false, name = "id_duenio") Long id_nuevo,
            @RequestParam(required = false, name = "dni") int dni_nuevo,
            @RequestParam(required = false, name = "nombre") String nombre_nuevo,
            @RequestParam(required = false, name = "apellido") String apellido_nuevo,
            @RequestParam(required = false, name = "numero_celular") String celular_nuevo) {

        duenioService.editarDuenio(id_viejo, id_nuevo, dni_nuevo, nombre_nuevo, apellido_nuevo, celular_nuevo);

        return duenioService.buscarDuenioPorId(id_nuevo);

    }

    @DeleteMapping("/ejercicio2/duenio/eliminar/{id}")
    public String eliminarDuenio(@PathVariable Long id) {
        duenioService.eliminarDuenio(id);
        return "Se ha eliminado al duenio con ID: " + id;
    }

}
