package com.dh.meli.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "joalheria")
public class Joalheria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "material", length = 100, nullable = false)
    private String material;

    @Column(name = "produto", length = 100, nullable = false)
    private String produto;

    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "quilates", nullable = false)
    private int quilates;

    @Column(name = "composicao", nullable = false)
    private int composicao;

    @Column(name = "preco", nullable = false)
    private double preco;

}
