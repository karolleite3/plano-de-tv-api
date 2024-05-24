package com.karol.estudo.planodetvapi.controller;

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

    @GetMapping
    public List<Canal> getAllCanais() {
        return canalService.getAllCanais();
    }

    @GetMapping("/{id}")
    public Canal getCanalById(@PathVariable Long id) {
        return canalService.getCanalById(id);
    }
}
