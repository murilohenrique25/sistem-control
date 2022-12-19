package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicamentoCaprinoController {

    @Autowired
    private MedicamentoCaprinoRepository medicamentoRepository;

    @GetMapping(value = "/medicamentocaprino/todos")
    public ResponseEntity<List<MedicamentoCaprino>> listarTodos() {
        return new ResponseEntity<>(medicamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/medicamentocaprino/salvar")
    @ResponseBody
    public ResponseEntity<MedicamentoCaprino> salvar(@RequestBody MedicamentoCaprino a) {
        MedicamentoCaprino temp = medicamentoRepository.save(a);
        return new ResponseEntity<MedicamentoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/medicamentocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        medicamentoRepository.deleteById(id);
        return "Deletado";
    }
}
