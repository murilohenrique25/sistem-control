package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoVolumosoBovinoCorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoVolumosoBovinoCorteRepository extends JpaRepository<NutricaoVolumosoBovinoCorte, Integer> {
}
