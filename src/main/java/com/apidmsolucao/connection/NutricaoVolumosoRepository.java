package com.apidmsolucao.connection;

import com.apidmsolucao.connection.NutricaoVolumoso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoVolumosoRepository extends JpaRepository<NutricaoVolumoso, Integer> {
}
