package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TratamentoCaprinoController {

    @Autowired
    private TratamentoCaprinoRepository tratamentoRepository;

    @GetMapping(value = "/tratamentocaprino/todos")
    public ResponseEntity<List<TratamentoCaprino>> listarTodos() {
        return new ResponseEntity<>(tratamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/tratamentocaprino/salvar")
    @ResponseBody
    public ResponseEntity<TratamentoCaprino> salvar(@RequestBody TratamentoCaprino a) {
        TratamentoCaprino temp = tratamentoRepository.save(a);
        return new ResponseEntity<TratamentoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tratamentocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        tratamentoRepository.deleteById(id);
        return "Deletado";
    }
}
