package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TratamentoCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamentoCaprinoRepository extends JpaRepository<TratamentoCaprino, Integer> {
}
