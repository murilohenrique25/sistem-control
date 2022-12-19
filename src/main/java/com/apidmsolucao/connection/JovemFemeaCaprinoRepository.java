package com.apidmsolucao.connection;

import com.apidmsolucao.connection.JovemFemeaCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JovemFemeaCaprinoRepository extends JpaRepository<JovemFemeaCaprino, Integer> {
}
