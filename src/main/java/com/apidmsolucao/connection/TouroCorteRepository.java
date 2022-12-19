package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TouroCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouroCorteRepository extends JpaRepository<TouroCorte, Integer> {
}
