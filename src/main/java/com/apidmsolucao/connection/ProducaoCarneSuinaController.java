package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProducaoCarneSuinaController {

    @Autowired
    private ProducaoCarneSuinaRepository producaoCarneSuinaRepository;

    @GetMapping(value = "/producaocarnesuina/todos")
    public ResponseEntity<List<ProducaoCarneSuina>> listarTodos() {
        return new ResponseEntity<>(producaoCarneSuinaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/producaocarnesuina/salvar")
    @ResponseBody
    public ResponseEntity<ProducaoCarneSuina> salvar(@RequestBody ProducaoCarneSuina a) {
        ProducaoCarneSuina temp = producaoCarneSuinaRepository.save(a);
        return new ResponseEntity<ProducaoCarneSuina>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/producaocarnesuina/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        producaoCarneSuinaRepository.deleteById(id);
        return "Deletado";
    }
}
