package com.karol.estudo.planodetvapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Canal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;

    @ManyToMany(mappedBy = "canais")
    private List<PacoteTV> pacotes;
}
