package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    @GetMapping(value = "/medicamento/todos")
    public ResponseEntity<List<Medicamento>> listarTodos() {
        return new ResponseEntity<>(medicamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/medicamento/salvar")
    @ResponseBody
    public ResponseEntity<Medicamento> salvar(@RequestBody Medicamento a) {
        Medicamento temp = medicamentoRepository.save(a);
        return new ResponseEntity<Medicamento>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/medicamento/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        medicamentoRepository.deleteById(id);
        return "Deletado";
    }
}
