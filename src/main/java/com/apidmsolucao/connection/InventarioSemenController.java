package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventarioSemenController {

    @Autowired
    private InventarioSemenRepository inventarioSemenRepository;

    @GetMapping(value = "/inventariosemen/todos")
    public ResponseEntity<List<InventarioSemen>> listarTodos() {
        return new ResponseEntity<>(inventarioSemenRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inventariosemen/salvar")
    @ResponseBody
    public ResponseEntity<InventarioSemen> salvar(@RequestBody InventarioSemen a) {
        InventarioSemen temp = inventarioSemenRepository.save(a);
        return new ResponseEntity<InventarioSemen>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inventariosemen/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inventarioSemenRepository.deleteById(id);
        return "Deletado";
    }
}
