package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoConcentradoBovinoCorteController {

    @Autowired
    private NutricaoConcentradaBovinoCorteRepository nutricaoConcentradaRepository;

    @GetMapping(value = "/nutricaoconcetradobovinocorte/todos")
    public ResponseEntity<List<NutricaoConcentradoBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(nutricaoConcentradaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaoconcetradobovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoConcentradoBovinoCorte> salvar(@RequestBody NutricaoConcentradoBovinoCorte a) {
        NutricaoConcentradoBovinoCorte temp = nutricaoConcentradaRepository.save(a);
        return new ResponseEntity<NutricaoConcentradoBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaoconcetradobovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoConcentradaRepository.deleteById(id);
        return "Deletado";
    }
}
