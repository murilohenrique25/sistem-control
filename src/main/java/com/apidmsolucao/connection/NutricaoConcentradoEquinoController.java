package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoConcentradoEquinoController {

    @Autowired
    private NutricaoConcentradaEquinoRepository nutricaoConcentradaRepository;

    @GetMapping(value = "/nutricaoconcetradoequino/todos")
    public ResponseEntity<List<NutricaoConcentradoEquino>> listarTodos() {
        return new ResponseEntity<>(nutricaoConcentradaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaoconcetradoequino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoConcentradoEquino> salvar(@RequestBody NutricaoConcentradoEquino a) {
        NutricaoConcentradoEquino temp = nutricaoConcentradaRepository.save(a);
        return new ResponseEntity<NutricaoConcentradoEquino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaoconcetradoequino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoConcentradaRepository.deleteById(id);
        return "Deletado";
    }
}
