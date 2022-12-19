package com.apidmsolucao.connection;

import com.apidmsolucao.connection.JovemMachoCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JovemMachoCaprinoRepository extends JpaRepository<JovemMachoCaprino, Integer> {
}
