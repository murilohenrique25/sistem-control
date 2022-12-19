package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Inseminacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InseminacaoRepository extends JpaRepository<Inseminacao, Integer> {
}
