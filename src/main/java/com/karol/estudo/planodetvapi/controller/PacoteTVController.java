package com.karol.estudo.planodetvapi.controller;

import com.karol.estudo.planodetvapi.dto.PacoteDeTVDTO;
import com.karol.estudo.planodetvapi.mapper.PacoteDeTVMapper;
import com.karol.estudo.planodetvapi.model.PacoteTV;
import com.karol.estudo.planodetvapi.service.PacoteTVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacotes")
public class PacoteTVController {

    @Autowired
    private PacoteTVService pacoteTVService;

    @Autowired
    private PacoteDeTVMapper mapper;

    @GetMapping
    public List<PacoteDeTVDTO> getAllPacotes() {
        return this.mapper.toListDTO(pacoteTVService.getAllPacotes());
    }

    @GetMapping("/{id}")
    public PacoteDeTVDTO getPacoteById(@PathVariable Long id) {
        return this.mapper.toDTO(pacoteTVService.getPacoteById(id));
    }

    @PostMapping
    public PacoteDeTVDTO createPacote(@RequestBody PacoteTV pacoteTV) {
        return this.mapper.toDTO(pacoteTVService.createPacote(pacoteTV));
    }

    @DeleteMapping("/{id}")
    public void deletePacote(@PathVariable Long id) {
        pacoteTVService.deletePacote(id);
    }
}
