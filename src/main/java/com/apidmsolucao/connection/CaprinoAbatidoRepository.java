package com.apidmsolucao.connection;

import com.apidmsolucao.connection.CaprinoAbatido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaprinoAbatidoRepository extends JpaRepository<CaprinoAbatido, Integer> {
}
