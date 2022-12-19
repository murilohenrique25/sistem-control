package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicamentoSuinoController {

    @Autowired
    private MedicamentoSuinoRepository medicamentoRepository;

    @GetMapping(value = "/medicamentosuino/todos")
    public ResponseEntity<List<MedicamentoSuino>> listarTodos() {
        return new ResponseEntity<>(medicamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/medicamentosuino/salvar")
    @ResponseBody
    public ResponseEntity<MedicamentoSuino> salvar(@RequestBody MedicamentoSuino a) {
        MedicamentoSuino temp = medicamentoRepository.save(a);
        return new ResponseEntity<MedicamentoSuino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/medicamentosuino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        medicamentoRepository.deleteById(id);
        return "Deletado";
    }
}
