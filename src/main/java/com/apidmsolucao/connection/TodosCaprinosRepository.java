package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TodosCaprino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosCaprinosRepository extends JpaRepository<TodosCaprino, Integer> {
}
