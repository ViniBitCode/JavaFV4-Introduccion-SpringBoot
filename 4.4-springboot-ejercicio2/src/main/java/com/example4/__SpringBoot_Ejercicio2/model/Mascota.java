package com.example4.__SpringBoot_Ejercicio2.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_mascota;
    
    @Basic
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    
    @OneToOne
    @JoinColumn(name = "duenio_id_duenio", referencedColumnName = "id_duenio")
    private Duenio un_duenio;
    
}
