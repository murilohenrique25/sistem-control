package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Cavalo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CavaloRepository extends JpaRepository<Cavalo, Integer> {
}
