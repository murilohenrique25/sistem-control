package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeiteController {

    @Autowired
    private LeiteRepository leiteRepository;

    @GetMapping(value = "/leite/todos")
    public ResponseEntity<List<Leite>> listarTodos() {
        return new ResponseEntity<>(leiteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/leite/salvar")
    @ResponseBody
    public ResponseEntity<Leite> salvar(@RequestBody Leite a) {
        Leite temp = leiteRepository.save(a);
        return new ResponseEntity<Leite>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/leite/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        leiteRepository.deleteById(id);
        return "Deletado";
    }
}
