package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BezerraCorteController {

    @Autowired
    private BezerraCorteRepository bezerraRepository;

    @GetMapping(value = "/bezerracorte/todos")
    public ResponseEntity<List<BezerraCorte>> listarTodos() {
        return new ResponseEntity<>(bezerraRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/bezerracorte/salvar")
    @ResponseBody
    public ResponseEntity<BezerraCorte> salvar(@RequestBody BezerraCorte a) {
        BezerraCorte bc = bezerraRepository.save(a);
        return new ResponseEntity<BezerraCorte>(bc, HttpStatus.OK);
    }

    @DeleteMapping(value = "/bezerracorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        bezerraRepository.deleteById(id);
        return "Deletado";
    }
}
