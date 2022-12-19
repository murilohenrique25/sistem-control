package com.apidmsolucao.connection;

import com.apidmsolucao.connection.PrecoCarneCaprina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoCarneCaprinaRepository extends JpaRepository<PrecoCarneCaprina, Integer> {
}
