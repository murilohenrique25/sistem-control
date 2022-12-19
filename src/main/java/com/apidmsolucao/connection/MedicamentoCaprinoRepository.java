package com.apidmsolucao.connection;

import com.apidmsolucao.connection.MedicamentoCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoCaprinoRepository extends JpaRepository<MedicamentoCaprino, Integer> {
}
