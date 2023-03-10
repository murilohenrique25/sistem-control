package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Matriz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatrizRepository extends JpaRepository<Matriz, Integer> {
}
