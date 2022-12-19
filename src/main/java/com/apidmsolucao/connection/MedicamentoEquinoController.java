package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicamentoEquinoController {

    @Autowired
    private MedicamentoEquinoRepository medicamentoRepository;

    @GetMapping(value = "/medicamentoequino/todos")
    public ResponseEntity<List<MedicamentoEquino>> listarTodos() {
        return new ResponseEntity<>(medicamentoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/medicamentoequino/salvar")
    @ResponseBody
    public ResponseEntity<MedicamentoEquino> salvar(@RequestBody MedicamentoEquino a) {
        MedicamentoEquino temp = medicamentoRepository.save(a);
        return new ResponseEntity<MedicamentoEquino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/medicamentoequino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        medicamentoRepository.deleteById(id);
        return "Deletado";
    }
}
