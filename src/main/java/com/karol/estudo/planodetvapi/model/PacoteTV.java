package com.karol.estudo.planodetvapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PacoteTV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String promocao;

    @ManyToMany
    @JoinTable(
            name = "pacote_canal",
            joinColumns = @JoinColumn(name = "pacote_id"),
            inverseJoinColumns = @JoinColumn(name = "canal_id")
    )
    private List<Canal> canais;
}
