package com.apidmsolucao.connection;

import com.apidmsolucao.connection.TodosCaprino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodosCaprinoController {

    @Autowired
    private TodosCaprinosRepository todosCaprinosRepository;

    @GetMapping(value = "/todoscaprino/todos")
    public ResponseEntity<List<TodosCaprino>> listarTodos() {
        return new ResponseEntity<>(todosCaprinosRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/todoscaprino/salvar")
    @ResponseBody
    public ResponseEntity<TodosCaprino> salvar(@RequestBody TodosCaprino a) {
        TodosCaprino temp = todosCaprinosRepository.save(a);
        return new ResponseEntity<TodosCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/todoscaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        todosCaprinosRepository.deleteById(id);
        return "Deletado";
    }
}
