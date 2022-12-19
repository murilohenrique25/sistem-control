package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoConcentradoCaprinoController {

    @Autowired
    private NutricaoConcentradaCaprinoRepository nutricaoConcentradaRepository;

    @GetMapping(value = "/nutricaoconcetradocaprino/todos")
    public ResponseEntity<List<NutricaoConcentradoCaprino>> listarTodos() {
        return new ResponseEntity<>(nutricaoConcentradaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaoconcetradocaprino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoConcentradoCaprino> salvar(@RequestBody NutricaoConcentradoCaprino a) {
        NutricaoConcentradoCaprino temp = nutricaoConcentradaRepository.save(a);
        return new ResponseEntity<NutricaoConcentradoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaoconcetradocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoConcentradaRepository.deleteById(id);
        return "Deletado";
    }
}
