package com.apidmsolucao.connection;

import com.apidmsolucao.connection.ProducaoCarneCaprina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducaoCarneCaprinaRepository extends JpaRepository<ProducaoCarneCaprina, Integer> {
}
