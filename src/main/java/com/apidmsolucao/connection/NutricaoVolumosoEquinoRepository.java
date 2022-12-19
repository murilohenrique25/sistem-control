package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoVolumosoEquino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoVolumosoEquinoRepository extends JpaRepository<NutricaoVolumosoEquino, Integer> {
}
