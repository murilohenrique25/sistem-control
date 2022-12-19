package com.apidmsolucao.connection;

import com.apidmsolucao.connection.LoteCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteCaprinoRepository extends JpaRepository<LoteCaprino, Integer> {
}
