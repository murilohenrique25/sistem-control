package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoVolumosoCaprinoController {

    @Autowired
    private NutricaoVolumosoCaprinoRepository nutricaoVolumosoRepository;

    @GetMapping(value = "/nutricaovolumosocaprino/todos")
    public ResponseEntity<List<NutricaoVolumosoCaprino>> listarTodos() {
        return new ResponseEntity<>(nutricaoVolumosoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaovolumosocaprino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoVolumosoCaprino> salvar(@RequestBody NutricaoVolumosoCaprino a) {
        NutricaoVolumosoCaprino temp = nutricaoVolumosoRepository.save(a);
        return new ResponseEntity<NutricaoVolumosoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaovolumosocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoVolumosoRepository.deleteById(id);
        return "Deletado";
    }
}
