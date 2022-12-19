package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TratamentoSuinoController {

    @Autowired
    private TratamentoSuinoRepository tratamentoRepository;

    @GetMapping(value = "/tratamentosuino/todos")
    public ResponseEntity<List<TratamentoSuino>> listarTodos() {
        return new ResponseEntity<>(tratamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/tratamentosuino/salvar")
    @ResponseBody
    public ResponseEntity<TratamentoSuino> salvar(@RequestBody TratamentoSuino a) {
        TratamentoSuino temp = tratamentoRepository.save(a);
        return new ResponseEntity<TratamentoSuino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tratamentosuino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        tratamentoRepository.deleteById(id);
        return "Deletado";
    }
}
