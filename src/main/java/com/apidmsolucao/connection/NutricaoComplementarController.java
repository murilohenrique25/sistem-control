package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoComplementarController {

    @Autowired
    private NutricaoComplementarRepository nutricaoComplementarRepository;

    @GetMapping(value = "/nutricaocomplementar/todos")
    public ResponseEntity<List<NutricaoComplementar>> listarTodos() {
        return new ResponseEntity<>(nutricaoComplementarRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaocomplementar/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoComplementar> salvar(@RequestBody NutricaoComplementar a) {
        NutricaoComplementar temp = nutricaoComplementarRepository.save(a);
        return new ResponseEntity<NutricaoComplementar>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaocomplementar/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoComplementarRepository.deleteById(id);
        return "Deletado";
    }
}
