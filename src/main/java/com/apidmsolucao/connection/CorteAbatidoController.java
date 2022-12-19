package com.apidmsolucao.connection;

import com.apidmsolucao.connection.CorteAbatido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CorteAbatidoController {

    @Autowired
    private CorteAbatidoRepository corteAbatidoRepository;

    @GetMapping(value = "/corteabatido/todos")
    public ResponseEntity<List<CorteAbatido>> listarTodos() {
        return new ResponseEntity<>(corteAbatidoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/corteabatido/salvar")
    @ResponseBody
    public ResponseEntity<CorteAbatido> salvar(@RequestBody CorteAbatido a) {
        CorteAbatido temp = corteAbatidoRepository.save(a);
        return new ResponseEntity<CorteAbatido>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/corteabatido/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        corteAbatidoRepository.deleteById(id);
        return "Deletado";
    }
}
