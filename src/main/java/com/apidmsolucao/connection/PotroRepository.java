package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Potro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotroRepository extends JpaRepository<Potro, Integer> {
}
