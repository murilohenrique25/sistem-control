package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoricoPartoSuinoController {

    @Autowired
    private HistoricoPartoSuinoRepository historicoPartoSuinoRepository;

    @GetMapping(value = "/historicopartosuino/todos")
    public ResponseEntity<List<HistoricoPartoSuino>> listarTodos() {
        return new ResponseEntity<>(historicoPartoSuinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/historicopartosuino/salvar")
    @ResponseBody
    public ResponseEntity<HistoricoPartoSuino> salvar(@RequestBody HistoricoPartoSuino a) {
        HistoricoPartoSuino temp = historicoPartoSuinoRepository.save(a);
        return new ResponseEntity<HistoricoPartoSuino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/historicopartosuino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        historicoPartoSuinoRepository.deleteById(id);
        return "Deletado";
    }
}
