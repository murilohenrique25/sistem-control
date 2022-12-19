package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Novilha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovilhaRepository extends JpaRepository<Novilha, Integer> {
}
