package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Bezerra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BezerraRepository extends JpaRepository<Bezerra, Integer> {
}
