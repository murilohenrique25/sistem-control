package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoConcentrado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoConcentradaRepository extends JpaRepository<NutricaoConcentrado, Integer> {
}
