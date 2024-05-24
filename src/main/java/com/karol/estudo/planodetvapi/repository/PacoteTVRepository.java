package com.karol.estudo.planodetvapi.repository;

import com.karol.estudo.planodetvapi.model.PacoteTV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacoteTVRepository extends JpaRepository<PacoteTV, Long> {
}
