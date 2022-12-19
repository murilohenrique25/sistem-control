package com.apidmsolucao.connection;

import com.apidmsolucao.connection.LoteBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteBovinoCorteRepository extends JpaRepository<LoteBovinoCorte, Integer> {
}
