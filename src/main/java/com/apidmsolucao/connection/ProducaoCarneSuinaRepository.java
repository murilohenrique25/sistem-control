package com.apidmsolucao.connection;

import com.apidmsolucao.connection.ProducaoCarneSuina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducaoCarneSuinaRepository extends JpaRepository<ProducaoCarneSuina, Integer> {
}
