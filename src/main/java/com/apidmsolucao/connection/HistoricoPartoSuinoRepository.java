package com.apidmsolucao.connection;

import com.apidmsolucao.connection.HistoricoPartoSuino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoPartoSuinoRepository extends JpaRepository<HistoricoPartoSuino, Integer> {
}
