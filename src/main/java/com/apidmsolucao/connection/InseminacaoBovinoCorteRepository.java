package com.apidmsolucao.connection;

import com.apidmsolucao.connection.InseminacaoBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InseminacaoBovinoCorteRepository extends JpaRepository<InseminacaoBovinoCorte, Integer> {
}
