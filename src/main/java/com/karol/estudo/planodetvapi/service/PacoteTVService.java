package com.karol.estudo.planodetvapi.service;

import com.karol.estudo.planodetvapi.model.PacoteTV;
import com.karol.estudo.planodetvapi.repository.PacoteTVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacoteTVService {

    @Autowired
    private PacoteTVRepository pacoteTVRepository;

    public List<PacoteTV> getAllPacotes() {
        return pacoteTVRepository.findAll();
    }

    public PacoteTV getPacoteById(Long id) {
        return pacoteTVRepository.findById(id).orElse(null);
    }

    public PacoteTV createPacote(PacoteTV pacoteTV) {
        return pacoteTVRepository.save(pacoteTV);
    }

    public void deletePacote(Long id) {
        pacoteTVRepository.deleteById(id);
    }
}