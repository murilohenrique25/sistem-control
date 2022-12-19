package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AleitamentoController {

    @Autowired
    private AleitamentoRepository aleitamentoRepository;

    @GetMapping(value = "/aleitamento/todos")
    public ResponseEntity<List<Aleitamento>> listarTodos() {

        return new ResponseEntity<>(aleitamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/aleitamento/salvar")
    @ResponseBody
    public ResponseEntity<Aleitamento> salvar(@RequestBody Aleitamento a) {
        Aleitamento aleitamento = aleitamentoRepository.save(a);
        return new ResponseEntity<Aleitamento>(aleitamento, HttpStatus.OK);
    }

    @DeleteMapping(value = "/aleitamento/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        aleitamentoRepository.deleteById(id);
        return "Deletado";
    }
}