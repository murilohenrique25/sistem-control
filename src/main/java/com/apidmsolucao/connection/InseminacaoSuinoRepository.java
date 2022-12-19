package com.apidmsolucao.connection;

import com.apidmsolucao.connection.InseminacaoSuino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InseminacaoSuinoRepository extends JpaRepository<InseminacaoSuino, Integer> {
}
