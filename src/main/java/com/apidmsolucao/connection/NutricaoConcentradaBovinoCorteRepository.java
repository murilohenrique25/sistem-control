package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoConcentradoBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoConcentradaBovinoCorteRepository
        extends JpaRepository<NutricaoConcentradoBovinoCorte, Integer> {
}
