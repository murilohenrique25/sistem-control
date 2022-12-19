package com.apidmsolucao.connection;

import com.apidmsolucao.connection.PrecoCarneSuina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoCarneSuinaRepository extends JpaRepository<PrecoCarneSuina, Integer> {
}
