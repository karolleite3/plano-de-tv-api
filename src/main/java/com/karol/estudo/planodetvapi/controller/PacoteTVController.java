package com.karol.estudo.planodetvapi.controller;

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

    @GetMapping
    public List<PacoteTV> getAllPacotes() {
        return pacoteTVService.getAllPacotes();
    }

    @GetMapping("/{id}")
    public PacoteTV getPacoteById(@PathVariable Long id) {
        return pacoteTVService.getPacoteById(id);
    }

    @PostMapping
    public PacoteTV createPacote(@RequestBody PacoteTV pacoteTV) {
        return pacoteTVService.createPacote(pacoteTV);
    }

    @DeleteMapping("/{id}")
    public void deletePacote(@PathVariable Long id) {
        pacoteTVService.deletePacote(id);
    }
}
