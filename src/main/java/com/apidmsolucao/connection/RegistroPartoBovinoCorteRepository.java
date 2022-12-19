package com.apidmsolucao.connection;

import com.apidmsolucao.connection.RegistroPartoBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroPartoBovinoCorteRepository extends JpaRepository<RegistroPartoBovinoCorte, Integer> {
}
