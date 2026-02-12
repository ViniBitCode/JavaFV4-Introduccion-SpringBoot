/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.service;

import com.example4.__SpringBoot_Ejercicio2.model.Mascota;
import com.example4.__SpringBoot_Ejercicio2.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepo;

    @Override
    public void agregarMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public Mascota traerMascotaPorID(Long id) {
        return mascotaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> traerMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public void editarMascota(Long id_viejo, Long id_nuevo, String nombre_nuevo, String especie_nueva, String raza_nueva, String color_nuevo) {
    
        Mascota mascota = this.traerMascotaPorID(id_viejo);
        
        mascota.setColor(color_nuevo);
        mascota.setEspecie(especie_nueva);
        mascota.setId_mascota(id_nuevo);
        mascota.setNombre(nombre_nuevo);
        mascota.setRaza(raza_nueva);
        
        mascotaRepo.save(mascota);
    
    }

    @Override
    public void eliminarMascota(Long id) {
       
        mascotaRepo.deleteById(id);
    
    }

    @Override
    public List<Mascota> traerMascotaConEspecie(String especie) {
        
        return mascotaRepo.findByEspecieContainingIgnoreCase(especie);
    
    }

}
