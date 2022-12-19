package com.apidmsolucao.connection;

import com.apidmsolucao.connection.PrecoLeite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoLeiteRepository extends JpaRepository<PrecoLeite, Integer> {
}
