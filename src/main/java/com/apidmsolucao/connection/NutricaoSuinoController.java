package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoSuinoController {

    @Autowired
    private NutricaoSuinoRepository nutricaoSuinoRepository;

    @GetMapping(value = "/nutricaosuino/todos")
    public ResponseEntity<List<NutricaoSuino>> listarTodos() {
        return new ResponseEntity<>(nutricaoSuinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaosuino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoSuino> salvar(@RequestBody NutricaoSuino a) {
        NutricaoSuino temp = nutricaoSuinoRepository.save(a);
        return new ResponseEntity<NutricaoSuino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaosuino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoSuinoRepository.deleteById(id);
        return "Deletado";
    }
}
