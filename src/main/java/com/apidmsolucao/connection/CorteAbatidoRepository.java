package com.apidmsolucao.connection;

import com.apidmsolucao.connection.CorteAbatido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorteAbatidoRepository extends JpaRepository<CorteAbatido, Integer> {
}
