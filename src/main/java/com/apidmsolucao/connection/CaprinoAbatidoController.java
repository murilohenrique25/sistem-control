package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaprinoAbatidoController {

    @Autowired
    private CaprinoAbatidoRepository caprinoAbatidoRepository;

    @GetMapping(value = "/caprinoabatido/todos")
    public ResponseEntity<List<CaprinoAbatido>> listarTodos() {
        return new ResponseEntity<>(caprinoAbatidoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/caprinoabatido/salvar")
    @ResponseBody
    public ResponseEntity<CaprinoAbatido> salvar(@RequestBody CaprinoAbatido a) {
        CaprinoAbatido temp = caprinoAbatidoRepository.save(a);
        return new ResponseEntity<CaprinoAbatido>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/caprinoabatido/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        caprinoAbatidoRepository.deleteById(id);
        return "Deletado";
    }
}
