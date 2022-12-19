package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TratamentoBovinoCorteController {

    @Autowired
    private TratamentoBovinoCorteRepository tratamentoRepository;

    @GetMapping(value = "/tratamentobovinocorte/todos")
    public ResponseEntity<List<TratamentoBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(tratamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/tratamentobovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<TratamentoBovinoCorte> salvar(@RequestBody TratamentoBovinoCorte a) {
        TratamentoBovinoCorte temp = tratamentoRepository.save(a);
        return new ResponseEntity<TratamentoBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tratamentobovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        tratamentoRepository.deleteById(id);
        return "Deletado";
    }
}
