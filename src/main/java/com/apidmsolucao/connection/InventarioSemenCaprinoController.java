package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventarioSemenCaprinoController {

    @Autowired
    private InventarioSemenCaprinoRepository inventarioSemenCaprinoRepository;

    @GetMapping(value = "/inventariosemencaprino/todos")
    public ResponseEntity<List<InventarioSemenCaprino>> listarTodos() {
        return new ResponseEntity<>(inventarioSemenCaprinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inventariosemencaprino/salvar")
    @ResponseBody
    public ResponseEntity<InventarioSemenCaprino> salvar(@RequestBody InventarioSemenCaprino a) {
        InventarioSemenCaprino temp = inventarioSemenCaprinoRepository.save(a);
        return new ResponseEntity<InventarioSemenCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inventariosemencaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inventarioSemenCaprinoRepository.deleteById(id);
        return "Deletado";
    }
}
