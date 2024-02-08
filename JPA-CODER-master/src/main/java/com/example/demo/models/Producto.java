package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Producto")
public class Producto {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;


    @Column
    @Getter
    @Setter
    private  String nombre;

    @Column
    @Getter
    @Setter
    private String descripcion;


    @Column
    @Getter
    @Setter
    private Long precio;





}
