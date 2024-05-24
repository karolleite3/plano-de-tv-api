package com.karol.estudo.planodetvapi;

import com.karol.estudo.planodetvapi.model.Canal;
import com.karol.estudo.planodetvapi.model.PacoteTV;
import com.karol.estudo.planodetvapi.repository.CanalRepository;
import com.karol.estudo.planodetvapi.repository.PacoteTVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CanalRepository canalRepository;

    @Autowired
    private PacoteTVRepository pacoteTVRepository;

    @Override
    public void run(String... args) throws Exception {
        // Criar canais
        Canal canal1 = new Canal();
        canal1.setNome("Canal 1");
        canal1.setCategoria("Notícias");

        Canal canal2 = new Canal();
        canal2.setNome("Canal 2");
        canal2.setCategoria("Esportes");

        Canal canal3 = new Canal();
        canal3.setNome("Canal 3");
        canal3.setCategoria("Filmes");

        Canal canal4 = new Canal();
        canal4.setNome("Canal 4");
        canal4.setCategoria("Séries");

        canalRepository.saveAll(Arrays.asList(canal1, canal2, canal3, canal4));

        // Criar pacotes de TV
        PacoteTV pacote1 = new PacoteTV();
        pacote1.setNome("Pacote Básico");
        pacote1.setDescricao("Pacote com canais básicos");
        pacote1.setPreco(29.99);
        pacote1.setPromocao("Desconto de 10% nos primeiros 3 meses");
        pacote1.setCanais(Arrays.asList(canal1, canal2));

        PacoteTV pacote2 = new PacoteTV();
        pacote2.setNome("Pacote Premium");
        pacote2.setDescricao("Pacote com canais premium");
        pacote2.setPreco(59.99);
        pacote2.setPromocao("Desconto de 20% no primeiro mês");
        pacote2.setCanais(Arrays.asList(canal3, canal4));

        pacoteTVRepository.saveAll(Arrays.asList(pacote1, pacote2));
    }
}
