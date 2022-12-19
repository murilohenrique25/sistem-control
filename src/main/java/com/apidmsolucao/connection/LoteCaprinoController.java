package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoteCaprinoController {

    @Autowired
    private LoteCaprinoRepository loteRepository;

    @GetMapping(value = "/lotecaprino/todos")
    public ResponseEntity<List<LoteCaprino>> listarTodos() {
        return new ResponseEntity<>(loteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/lotecaprino/salvar")
    @ResponseBody
    public ResponseEntity<LoteCaprino> salvar(@RequestBody LoteCaprino a) {
        LoteCaprino temp = loteRepository.save(a);
        return new ResponseEntity<LoteCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/lotecaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        loteRepository.deleteById(id);
        return "Deletado";
    }
}
