package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventarioSemenBovinoCorteController {

    @Autowired
    private InventarioSemenBovinoCorteRepository inventarioSemenRepository;

    @GetMapping(value = "/inventariosemenbovinocorte/todos")
    public ResponseEntity<List<InventarioSemenBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(inventarioSemenRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inventariosemenbovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<InventarioSemenBovinoCorte> salvar(@RequestBody InventarioSemenBovinoCorte a) {
        InventarioSemenBovinoCorte temp = inventarioSemenRepository.save(a);
        return new ResponseEntity<InventarioSemenBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inventariosemenbovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inventarioSemenRepository.deleteById(id);
        return "Deletado";
    }
}
