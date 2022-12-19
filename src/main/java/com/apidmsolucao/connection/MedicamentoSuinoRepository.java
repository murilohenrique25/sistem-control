package com.apidmsolucao.connection;

import com.apidmsolucao.connection.MedicamentoSuino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoSuinoRepository extends JpaRepository<MedicamentoSuino, Integer> {
}
