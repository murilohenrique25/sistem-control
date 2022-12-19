package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoConcentradoEquino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoConcentradaEquinoRepository extends JpaRepository<NutricaoConcentradoEquino, Integer> {
}
