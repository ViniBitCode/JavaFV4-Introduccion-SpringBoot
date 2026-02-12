/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example4.__SpringBoot_Ejercicio2.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Duenio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_duenio;
    
    @Basic
    private Integer dni;
    private String nombre;
    private String apellido;
    private String numero_celular; 
    
}
