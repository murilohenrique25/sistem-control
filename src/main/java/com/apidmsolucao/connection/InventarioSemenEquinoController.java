package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventarioSemenEquinoController {

    @Autowired
    private InventarioSemenEquinoRepository inventarioSemenEquinoRepository;

    @GetMapping(value = "/inventariosemenequino/todos")
    public ResponseEntity<List<InventarioSemenEquino>> listarTodos() {
        return new ResponseEntity<>(inventarioSemenEquinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inventariosemenequino/salvar")
    @ResponseBody
    public ResponseEntity<InventarioSemenEquino> salvar(@RequestBody InventarioSemenEquino a) {
        InventarioSemenEquino temp = inventarioSemenEquinoRepository.save(a);
        return new ResponseEntity<InventarioSemenEquino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inventariosemenequino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inventarioSemenEquinoRepository.deleteById(id);
        return "Deletado";
    }
}
