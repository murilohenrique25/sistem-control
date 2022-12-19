package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Vaca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacaRepository extends JpaRepository<Vaca, Integer> {
}
