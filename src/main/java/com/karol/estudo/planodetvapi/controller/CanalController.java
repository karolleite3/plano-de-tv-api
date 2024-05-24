package com.karol.estudo.planodetvapi.controller;

import com.karol.estudo.planodetvapi.dto.CanalDTO;
import com.karol.estudo.planodetvapi.mapper.CanalMapper;
import com.karol.estudo.planodetvapi.model.Canal;
import com.karol.estudo.planodetvapi.service.CanalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/canais")
public class CanalController {

    @Autowired
    private CanalService canalService;

    @Autowired
    private CanalMapper mapper;

    @GetMapping
    public List<CanalDTO> getAllCanais() {
        return this.mapper.toListDTO(canalService.getAllCanais());
    }

    @GetMapping("/{id}")
    public CanalDTO getCanalById(@PathVariable Long id) {
        return this.mapper.toDTO(canalService.getCanalById(id));
    }
}
