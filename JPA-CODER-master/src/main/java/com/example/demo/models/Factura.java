package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Getter
    @Setter
    private String nombreProducto;

    @Column
    @Getter
    @Setter
    private Date fecha;

    @Column
    @Getter
    @Setter
    private Long precio;
}
