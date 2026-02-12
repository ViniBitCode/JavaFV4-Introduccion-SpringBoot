/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.service;

import com.example4.__SpringBoot_Ejercicio2.dto.DuenioMascotaDTO;
import com.example4.__SpringBoot_Ejercicio2.model.Mascota;
import java.util.List;

public interface IMascotaService {

    public void agregarMascota(Mascota mascota);

    public Mascota traerMascotaPorID(Long id);

    public List<Mascota> traerMascotas();

    public void editarMascota(Long id_viejo, Long id_nuevo, String nombre_nuevo, String especie_nueva, String raza_nueva, String color_nuevo);

    public void eliminarMascota(Long id);

    public List<Mascota> traerMascotaConEspecie(String especie);

}
