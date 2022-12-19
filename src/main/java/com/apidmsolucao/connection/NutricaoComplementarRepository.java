package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoComplementar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoComplementarRepository extends JpaRepository<NutricaoComplementar, Integer> {
}
