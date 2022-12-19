package com.apidmsolucao.connection;

import com.apidmsolucao.connection.InventarioSemenCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioSemenCaprinoRepository extends JpaRepository<InventarioSemenCaprino, Integer> {
}
