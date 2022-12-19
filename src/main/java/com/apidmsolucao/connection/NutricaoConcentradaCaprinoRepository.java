package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoConcentradoCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoConcentradaCaprinoRepository extends JpaRepository<NutricaoConcentradoCaprino, Integer> {
}
