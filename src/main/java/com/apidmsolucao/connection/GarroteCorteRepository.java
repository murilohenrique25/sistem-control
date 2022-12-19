package com.apidmsolucao.connection;

import com.apidmsolucao.connection.GarroteCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarroteCorteRepository extends JpaRepository<GarroteCorte, Integer> {
}
