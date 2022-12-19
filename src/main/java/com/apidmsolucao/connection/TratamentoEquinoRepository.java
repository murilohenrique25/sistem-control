package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TratamentoEquino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamentoEquinoRepository extends JpaRepository<TratamentoEquino, Integer> {
}
