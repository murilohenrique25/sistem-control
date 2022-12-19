package com.apidmsolucao.connection;

import com.apidmsolucao.connection.MedicamentoEquino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoEquinoRepository extends JpaRepository<MedicamentoEquino, Integer> {
}
