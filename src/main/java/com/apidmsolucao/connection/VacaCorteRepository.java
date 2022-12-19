package com.apidmsolucao.connection;

import com.apidmsolucao.connection.VacaCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacaCorteRepository extends JpaRepository<VacaCorte, Integer> {
}
