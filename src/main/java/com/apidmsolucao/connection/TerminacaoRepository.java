package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Terminacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminacaoRepository extends JpaRepository<Terminacao, Integer> {
}
