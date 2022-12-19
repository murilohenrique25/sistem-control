package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrecoCarneCaprinaController {

    @Autowired
    private PrecoCarneCaprinaRepository precoCarneCaprinaRepository;

    @GetMapping(value = "/precocarnecaprina/todos")
    public ResponseEntity<List<PrecoCarneCaprina>> listarTodos() {
        return new ResponseEntity<>(precoCarneCaprinaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/precocarnecaprina/salvar")
    @ResponseBody
    public ResponseEntity<PrecoCarneCaprina> salvar(@RequestBody PrecoCarneCaprina a) {
        PrecoCarneCaprina temp = precoCarneCaprinaRepository.save(a);
        return new ResponseEntity<PrecoCarneCaprina>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/precocarnecaprina/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        precoCarneCaprinaRepository.deleteById(id);
        return "Deletado";
    }
}
