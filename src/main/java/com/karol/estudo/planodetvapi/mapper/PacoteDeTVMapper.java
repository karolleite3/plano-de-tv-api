package com.karol.estudo.planodetvapi.mapper;

import com.karol.estudo.planodetvapi.dto.PacoteDeTVDTO;
import com.karol.estudo.planodetvapi.model.PacoteTV;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PacoteDeTVMapper {
    PacoteDeTVDTO toDTO(PacoteTV pacoteTV);

    List<PacoteDeTVDTO> toListDTO(List<PacoteTV> pacoteTVs);
}
