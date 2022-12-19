package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BezerroCorteController {

    @Autowired
    private BezerroCorteRepository bezerroRepository;

    @GetMapping(value = "/bezerrocorte/todos")
    public ResponseEntity<List<BezerroCorte>> listarTodos() {
        return new ResponseEntity<>(bezerroRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/bezerrocorte/salvar")
    @ResponseBody
    public ResponseEntity<BezerroCorte> salvar(@RequestBody BezerroCorte a) {
        BezerroCorte bc = bezerroRepository.save(a);
        return new ResponseEntity<BezerroCorte>(bc, HttpStatus.OK);
    }

    @DeleteMapping(value = "/bezerrocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        bezerroRepository.deleteById(id);
        return "Deletado";
    }
}
