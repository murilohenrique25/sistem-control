package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Egua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EguaRepository extends JpaRepository<Egua, Integer> {
}
