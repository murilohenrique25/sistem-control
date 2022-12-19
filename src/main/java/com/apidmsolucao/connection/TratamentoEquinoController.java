package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TratamentoEquinoController {

    @Autowired
    private TratamentoEquinoRepository tratamentoRepository;

    @GetMapping(value = "/tratamentoequino/todos")
    public ResponseEntity<List<TratamentoEquino>> listarTodos() {
        return new ResponseEntity<>(tratamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/tratamentoequino/salvar")
    @ResponseBody
    public ResponseEntity<TratamentoEquino> salvar(@RequestBody TratamentoEquino a) {
        TratamentoEquino temp = tratamentoRepository.save(a);
        return new ResponseEntity<TratamentoEquino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tratamentoequino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        tratamentoRepository.deleteById(id);
        return "Deletado";
    }
}
