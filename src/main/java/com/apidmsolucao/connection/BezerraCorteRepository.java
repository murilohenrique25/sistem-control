package com.apidmsolucao.connection;

import com.apidmsolucao.connection.BezerraCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BezerraCorteRepository extends JpaRepository<BezerraCorte, Integer> {
}
