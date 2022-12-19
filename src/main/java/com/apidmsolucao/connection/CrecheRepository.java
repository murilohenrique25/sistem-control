package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Creche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrecheRepository extends JpaRepository<Creche, Integer> {
}
