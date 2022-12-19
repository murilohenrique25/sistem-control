package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatrizController {

    @Autowired
    private MatrizRepository matrizRepository;

    @GetMapping(value = "/matriz/todos")
    public ResponseEntity<List<Matriz>> listarTodos() {
        return new ResponseEntity<>(matrizRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/matriz/salvar")
    @ResponseBody
    public ResponseEntity<Matriz> salvar(@RequestBody Matriz a) {
        Matriz temp = matrizRepository.save(a);
        return new ResponseEntity<Matriz>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/matriz/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        matrizRepository.deleteById(id);
        return "Deletado";
    }
}
