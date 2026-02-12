/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.repository;

import com.example4.__SpringBoot_Ejercicio2.model.Mascota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {

    List<Mascota> findByEspecieContainingIgnoreCase(String especie);
    
    List<Mascota> findByRazaContainingIgnoreCase(String raza);
    
}
