package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TratamentoSuino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamentoSuinoRepository extends JpaRepository<TratamentoSuino, Integer> {
}
