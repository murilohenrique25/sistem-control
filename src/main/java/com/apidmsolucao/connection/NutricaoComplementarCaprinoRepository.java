package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoComplementarCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoComplementarCaprinoRepository extends JpaRepository<NutricaoComplementarCaprino, Integer> {
}
