package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProducaoCarneCaprinaController {

    @Autowired
    private ProducaoCarneCaprinaRepository producaoCarneCaprinaRepository;

    @GetMapping(value = "/producaocarnecaprina/todos")
    public ResponseEntity<List<ProducaoCarneCaprina>> listarTodos() {
        return new ResponseEntity<>(producaoCarneCaprinaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/producaocarnecaprina/salvar")
    @ResponseBody
    public ResponseEntity<ProducaoCarneCaprina> salvar(@RequestBody ProducaoCarneCaprina a) {
        ProducaoCarneCaprina temp = producaoCarneCaprinaRepository.save(a);
        return new ResponseEntity<ProducaoCarneCaprina>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/producaocarnecaprina/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        producaoCarneCaprinaRepository.deleteById(id);
        return "Deletado";
    }
}
