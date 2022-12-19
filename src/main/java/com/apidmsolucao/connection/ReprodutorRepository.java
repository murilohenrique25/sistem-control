package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Reprodutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReprodutorRepository extends JpaRepository<Reprodutor, Integer> {
}
