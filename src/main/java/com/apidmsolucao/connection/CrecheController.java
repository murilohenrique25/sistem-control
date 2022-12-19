package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrecheController {

    @Autowired
    private CrecheRepository crecheRepository;

    @GetMapping(value = "/creche/todos")
    public ResponseEntity<List<Creche>> listarTodos() {
        return new ResponseEntity<>(crecheRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/creche/salvar")
    @ResponseBody
    public ResponseEntity<Creche> salvar(@RequestBody Creche a) {
        Creche temp = crecheRepository.save(a);
        return new ResponseEntity<Creche>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/creche/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        crecheRepository.deleteById(id);
        return "Deletado";
    }
}
