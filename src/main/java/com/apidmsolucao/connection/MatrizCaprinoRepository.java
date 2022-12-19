package com.apidmsolucao.connection;

import com.apidmsolucao.connection.MatrizCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatrizCaprinoRepository extends JpaRepository<MatrizCaprino, Integer> {
}
