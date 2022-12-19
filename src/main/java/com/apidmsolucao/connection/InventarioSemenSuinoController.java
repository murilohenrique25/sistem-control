package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventarioSemenSuinoController {

    @Autowired
    private InventarioSemenSuinoRepository inventarioSemenSuinoRepository;

    @GetMapping(value = "/inventariosemensuino/todos")
    public ResponseEntity<List<InventarioSemenSuino>> listarTodos() {
        return new ResponseEntity<>(inventarioSemenSuinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inventariosemensuino/salvar")
    @ResponseBody
    public ResponseEntity<InventarioSemenSuino> salvar(@RequestBody InventarioSemenSuino a) {
        InventarioSemenSuino temp = inventarioSemenSuinoRepository.save(a);
        return new ResponseEntity<InventarioSemenSuino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inventariosemensuino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inventarioSemenSuinoRepository.deleteById(id);
        return "Deletado";
    }
}
