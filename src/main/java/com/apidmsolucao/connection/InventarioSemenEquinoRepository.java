package com.apidmsolucao.connection;

import com.apidmsolucao.connection.InventarioSemenEquino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioSemenEquinoRepository extends JpaRepository<InventarioSemenEquino, Integer> {
}
