package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String nombre;

    @Column(name="correo")
    @Getter
    @Setter
    private String email;

}

