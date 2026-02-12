/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.service;

import com.example4.__SpringBoot_Ejercicio2.model.Duenio;
import com.example4.__SpringBoot_Ejercicio2.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public void crearDuenio(Duenio duenio) {

        duenioRepo.save(duenio);

    }

    @Override
    public void editarDuenio(Long id_viejo, Long id_nuevo, int dni_nuevo, String nombre_nuevo, String apellido_nuevo, String celular_nuevo) {

        Duenio duenio = this.buscarDuenioPorId(id_viejo);
        duenio.setApellido(apellido_nuevo);
        duenio.setDni(dni_nuevo);
        duenio.setId_duenio(id_nuevo);
        duenio.setNombre(nombre_nuevo);
        duenio.setNumero_celular(nombre_nuevo);

        duenioRepo.save(duenio);

    }

    @Override
    public void eliminarDuenio(Long id) {

        duenioRepo.deleteById(id);

    }

    @Override
    public Duenio buscarDuenioPorId(Long id) {

        return duenioRepo.findById(id).orElse(null);

    }

    @Override
    public List<Duenio> obtenerDuenios() {

        return duenioRepo.findAll();

    }

}
