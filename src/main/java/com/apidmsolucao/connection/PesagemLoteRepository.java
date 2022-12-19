package com.apidmsolucao.connection;

import com.apidmsolucao.connection.PesagemLote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesagemLoteRepository extends JpaRepository<PesagemLote, Integer> {
}
