package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NovilhaController {

    @Autowired
    private NovilhaRepository novilhaRepository;

    @GetMapping(value = "/novilha/todos")
    public ResponseEntity<List<Novilha>> listarTodos() {
        return new ResponseEntity<>(novilhaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/novilha/salvar")
    @ResponseBody
    public ResponseEntity<Novilha> salvar(@RequestBody Novilha a) {
        Novilha temp = novilhaRepository.save(a);
        return new ResponseEntity<Novilha>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/novilha/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        novilhaRepository.deleteById(id);
        return "Deletado";
    }
}
