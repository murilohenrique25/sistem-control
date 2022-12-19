package com.apidmsolucao.connection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroPartoCaprinoRepository extends JpaRepository<RegistroPartoCaprino, Integer> {
}
