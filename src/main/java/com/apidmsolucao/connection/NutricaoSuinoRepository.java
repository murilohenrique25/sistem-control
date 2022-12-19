package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoSuino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoSuinoRepository extends JpaRepository<NutricaoSuino, Integer> {
}
