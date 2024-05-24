package com.karol.estudo.planodetvapi.service;

import com.karol.estudo.planodetvapi.model.Canal;
import com.karol.estudo.planodetvapi.repository.CanalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanalService {

    @Autowired
    private CanalRepository canalRepository;

    public List<Canal> getAllCanais() {
        return canalRepository.findAll();
    }

    public Canal getCanalById(Long id) {
        return canalRepository.findById(id).orElse(null);
    }
}
