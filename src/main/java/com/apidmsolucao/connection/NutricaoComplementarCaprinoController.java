package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoComplementarCaprinoController {

    @Autowired
    private NutricaoComplementarCaprinoRepository nutricaoComplementarRepository;

    @GetMapping(value = "/nutricaocomplementarcaprino/todos")
    public ResponseEntity<List<NutricaoComplementarCaprino>> listarTodos() {
        return new ResponseEntity<>(nutricaoComplementarRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaocomplementarcaprino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoComplementarCaprino> salvar(@RequestBody NutricaoComplementarCaprino a) {
        NutricaoComplementarCaprino temp = nutricaoComplementarRepository.save(a);
        return new ResponseEntity<NutricaoComplementarCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaocomplementarcaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoComplementarRepository.deleteById(id);
        return "Deletado";
    }
}
