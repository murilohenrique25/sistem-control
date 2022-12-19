package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JovemFemeaCaprinoController {

    @Autowired
    private JovemFemeaCaprinoRepository jovemFemeaCaprinoRepository;

    @GetMapping(value = "/jovemfemeacaprino/todos")
    public ResponseEntity<List<JovemFemeaCaprino>> listarTodos() {
        return new ResponseEntity<>(jovemFemeaCaprinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/jovemfemeacaprino/salvar")
    @ResponseBody
    public ResponseEntity<JovemFemeaCaprino> salvar(@RequestBody JovemFemeaCaprino a) {
        JovemFemeaCaprino temp = jovemFemeaCaprinoRepository.save(a);
        return new ResponseEntity<JovemFemeaCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/jovemfemeacaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        jovemFemeaCaprinoRepository.deleteById(id);
        return "Deletado";
    }
}
