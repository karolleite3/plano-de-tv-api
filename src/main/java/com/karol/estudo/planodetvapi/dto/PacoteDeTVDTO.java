package com.karol.estudo.planodetvapi.dto;

import java.util.List;

public record PacoteDeTVDTO(
        Long id,
        String nome,
        String descricao,
        Double preco,
        String promocao,
        List<CanalDTO> canais) {
}
