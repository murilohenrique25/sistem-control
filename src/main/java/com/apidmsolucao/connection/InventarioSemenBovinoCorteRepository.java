package com.apidmsolucao.connection;

import com.apidmsolucao.connection.InventarioSemenBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioSemenBovinoCorteRepository extends JpaRepository<InventarioSemenBovinoCorte, Integer> {
}
