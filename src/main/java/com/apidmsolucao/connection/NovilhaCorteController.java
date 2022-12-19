package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NovilhaCorteController {

    @Autowired
    private NovilhaCorteRepository novilhaCorteRepository;

    @GetMapping(value = "/novilhacorte/todos")
    public ResponseEntity<List<NovilhaCorte>> listarTodos() {
        return new ResponseEntity<>(novilhaCorteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/novilhacorte/salvar")
    @ResponseBody
    public ResponseEntity<NovilhaCorte> salvar(@RequestBody NovilhaCorte a) {
        NovilhaCorte temp = novilhaCorteRepository.save(a);
        return new ResponseEntity<NovilhaCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/novilhacorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        novilhaCorteRepository.deleteById(id);
        return "Deletado";
    }
}
