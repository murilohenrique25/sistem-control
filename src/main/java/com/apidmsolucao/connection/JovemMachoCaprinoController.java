package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JovemMachoCaprinoController {

    @Autowired
    private JovemMachoCaprinoRepository jovemMachoCaprinoRepository;

    @GetMapping(value = "/jovemmachocaprino/todos")
    public ResponseEntity<List<JovemMachoCaprino>> listarTodos() {
        return new ResponseEntity<>(jovemMachoCaprinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/jovemmachocaprino/salvar")
    @ResponseBody
    public ResponseEntity<JovemMachoCaprino> salvar(@RequestBody JovemMachoCaprino a) {
        JovemMachoCaprino temp = jovemMachoCaprinoRepository.save(a);
        return new ResponseEntity<JovemMachoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/jovemmachocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        jovemMachoCaprinoRepository.deleteById(id);
        return "Deletado";
    }
}
