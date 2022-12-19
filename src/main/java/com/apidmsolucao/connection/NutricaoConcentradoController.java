package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoConcentradoController {

    @Autowired
    private NutricaoConcentradaRepository nutricaoConcentradaRepository;

    @GetMapping(value = "/nutricaoconcetrado/todos")
    public ResponseEntity<List<NutricaoConcentrado>> listarTodos() {
        return new ResponseEntity<>(nutricaoConcentradaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaoconcetrado/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoConcentrado> salvar(@RequestBody NutricaoConcentrado a) {
        NutricaoConcentrado temp = nutricaoConcentradaRepository.save(a);
        return new ResponseEntity<NutricaoConcentrado>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaoconcetrado/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoConcentradaRepository.deleteById(id);
        return "Deletado";
    }
}
