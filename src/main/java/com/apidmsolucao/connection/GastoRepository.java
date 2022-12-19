package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Integer> {
}
