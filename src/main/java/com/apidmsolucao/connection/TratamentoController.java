package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TratamentoController {

    @Autowired
    private TratamentoRepository tratamentoRepository;

    @GetMapping(value = "/tratamento/todos")
    public ResponseEntity<List<Tratamento>> listarTodos() {
        return new ResponseEntity<>(tratamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/tratamento/salvar")
    @ResponseBody
    public ResponseEntity<Tratamento> salvar(@RequestBody Tratamento a) {
        Tratamento temp = tratamentoRepository.save(a);
        return new ResponseEntity<Tratamento>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tratamento/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        tratamentoRepository.deleteById(id);
        return "Deletado";
    }
}
