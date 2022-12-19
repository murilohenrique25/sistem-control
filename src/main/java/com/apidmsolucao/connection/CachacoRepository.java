package com.apidmsolucao.connection;

import com.apidmsolucao.connection.Cachaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CachacoRepository extends JpaRepository<Cachaco, Integer> {
}
