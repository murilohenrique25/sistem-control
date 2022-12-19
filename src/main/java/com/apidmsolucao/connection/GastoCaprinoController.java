package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GastoCaprinoController {

    @Autowired
    private GastoCaprinoRepository gastoRepository;

    @GetMapping(value = "/gastocaprino/todos")
    public ResponseEntity<List<GastoCaprino>> listarTodos() {
        return new ResponseEntity<>(gastoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/gastocaprino/salvar")
    @ResponseBody
    public ResponseEntity<GastoCaprino> salvar(@RequestBody GastoCaprino a) {
        GastoCaprino temp = gastoRepository.save(a);
        return new ResponseEntity<GastoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/gastocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        gastoRepository.deleteById(id);
        return "Deletado";
    }
}
