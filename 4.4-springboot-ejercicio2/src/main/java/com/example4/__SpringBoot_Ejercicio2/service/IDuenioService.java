/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.service;

import com.example4.__SpringBoot_Ejercicio2.model.Duenio;
import java.util.List;

public interface IDuenioService {

    public void crearDuenio(Duenio duenio);

    public void editarDuenio(Long id_viejo, Long id_nuevo, int dni_nuevo, String nombre_nuevo, String apellido_nuevo, String celular_nuevo);

    public void eliminarDuenio(Long id);

    public Duenio buscarDuenioPorId(Long id);

    public List<Duenio> obtenerDuenios();
}
