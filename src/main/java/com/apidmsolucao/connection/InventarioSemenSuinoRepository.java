package com.apidmsolucao.connection;

import com.apidmsolucao.connection.InventarioSemenSuino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioSemenSuinoRepository extends JpaRepository<InventarioSemenSuino, Integer> {
}
