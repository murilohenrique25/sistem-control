package com.apidmsolucao.connection;

import com.apidmsolucao.connection.GastoCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoCaprinoRepository extends JpaRepository<GastoCaprino, Integer> {
}
