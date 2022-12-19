package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Tratamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamentoRepository extends JpaRepository<Tratamento, Integer> {
}
