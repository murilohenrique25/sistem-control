package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoComplementarEquinoController {

    @Autowired
    private NutricaoComplementarEquinoRepository nutricaoComplementarRepository;

    @GetMapping(value = "/nutricaocomplementarequino/todos")
    public ResponseEntity<List<NutricaoComplementarEquino>> listarTodos() {
        return new ResponseEntity<>(nutricaoComplementarRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaocomplementarequino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoComplementarEquino> salvar(@RequestBody NutricaoComplementarEquino a) {
        NutricaoComplementarEquino temp = nutricaoComplementarRepository.save(a);
        return new ResponseEntity<NutricaoComplementarEquino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaocomplementarequino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoComplementarRepository.deleteById(id);
        return "Deletado";
    }
}
