package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TratamentoBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamentoBovinoCorteRepository extends JpaRepository<TratamentoBovinoCorte, Integer> {
}
