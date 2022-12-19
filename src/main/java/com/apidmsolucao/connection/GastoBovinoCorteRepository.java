package com.apidmsolucao.connection;

import com.apidmsolucao.connection.GastoBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoBovinoCorteRepository extends JpaRepository<GastoBovinoCorte, Integer> {
}
