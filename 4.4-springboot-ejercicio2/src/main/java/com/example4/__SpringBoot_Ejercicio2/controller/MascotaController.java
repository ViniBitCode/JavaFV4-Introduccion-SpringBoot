/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.controller;

import com.example4.__SpringBoot_Ejercicio2.dto.DuenioMascotaDTO;
import com.example4.__SpringBoot_Ejercicio2.model.Mascota;
import com.example4.__SpringBoot_Ejercicio2.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/ejercicio2/mascota/obtener_por_id/{id}")
    public Mascota obtenerMascotaPorID(@PathVariable Long id) {
        return mascotaService.traerMascotaPorID(id);
    }

    @GetMapping("/ejercicio2/mascota/obtener_todos")
    public List<Mascota> obtenerTodasMascotas() {
        return mascotaService.traerMascotas();
    }

    @GetMapping("/ejercicio2/mascota/obtener_por_nombre/{especie}")
    public List<Mascota> obtenerMascotaPorEspecie(@PathVariable String especie) {
        return mascotaService.traerMascotaConEspecie(especie);
    }

    @PostMapping("/ejercicio2/mascota/agregar")
    public String agregarMascota(@RequestBody Mascota mascota) {
        mascotaService.agregarMascota(mascota);
        return "Se ha creado una nueva mascota: " + mascota.getId_mascota();
    }

    @GetMapping("/ejercicio2/mascota/duenio_mascota/{id_mascota}")
    @ResponseBody
    public DuenioMascotaDTO devolverMascotaConDuenio(@PathVariable Long id_mascota) {

        Mascota mascota = mascotaService.traerMascotaPorID(id_mascota);
        DuenioMascotaDTO duenioMascota = new DuenioMascotaDTO();
        duenioMascota.setApellido_duenio(mascota.getUn_duenio().getApellido());
        duenioMascota.setNombre_duenio(mascota.getUn_duenio().getNombre());
        duenioMascota.setEspecie_mascota(mascota.getEspecie());
        duenioMascota.setNombre_mascota(mascota.getNombre());
        duenioMascota.setRaza_mascota(mascota.getRaza());

        return duenioMascota;

    }

    @DeleteMapping("/ejercicio2/mascota/eliminar/{id}")
    public String eliminarMascota(@PathVariable Long id) {
        mascotaService.eliminarMascota(id);
        return "Se ha eliminado la mascota con el ID: " + id;
    }

    @PutMapping("/ejercicio2/mascota/editar/{id_viejo}")
    public Mascota editarMascota(@PathVariable Long id_viejo,
            @RequestParam(required = false, name = "id_mascota") Long id_nuevo,
            @RequestParam(required = false, name = "nombre") String nombre_nuevo,
            @RequestParam(required = false, name = "especie") String especie_nuevo,
            @RequestParam(required = false, name = "raza") String raza_nuevo,
            @RequestParam(required = false, name = "color") String color_nuevo) {

        mascotaService.editarMascota(id_viejo, id_nuevo, nombre_nuevo, especie_nuevo, raza_nuevo, color_nuevo);

        return mascotaService.traerMascotaPorID(id_nuevo);
    }

}
