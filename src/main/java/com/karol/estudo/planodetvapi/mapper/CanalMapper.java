package com.karol.estudo.planodetvapi.mapper;

import com.karol.estudo.planodetvapi.dto.CanalDTO;
import com.karol.estudo.planodetvapi.model.Canal;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CanalMapper {

    CanalDTO toDTO(Canal canal);

    List<CanalDTO> toListDTO(List<Canal> canals);
}
