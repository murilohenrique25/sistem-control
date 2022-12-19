package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NovilhaCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovilhaCorteRepository extends JpaRepository<NovilhaCorte, Integer> {
}
