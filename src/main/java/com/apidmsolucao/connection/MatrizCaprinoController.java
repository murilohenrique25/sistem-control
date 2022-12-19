package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatrizCaprinoController {

    @Autowired
    private MatrizCaprinoRepository matrizCaprinoRepository;

    @GetMapping(value = "/matrizcaprino/todos")
    public ResponseEntity<List<MatrizCaprino>> listarTodos() {
        return new ResponseEntity<>(matrizCaprinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/matrizcaprino/salvar")
    @ResponseBody
    public ResponseEntity<MatrizCaprino> salvar(@RequestBody MatrizCaprino a) {
        MatrizCaprino temp = matrizCaprinoRepository.save(a);
        return new ResponseEntity<MatrizCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/matrizcaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        matrizCaprinoRepository.deleteById(id);
        return "Deletado";
    }
}
