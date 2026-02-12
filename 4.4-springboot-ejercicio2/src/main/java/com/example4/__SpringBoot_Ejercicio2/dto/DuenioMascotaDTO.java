/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DuenioMascotaDTO implements Serializable{
    
    private String nombre_mascota;
    private String especie_mascota;
    private String raza_mascota;
    private String nombre_duenio;
    private String apellido_duenio;
    
}
