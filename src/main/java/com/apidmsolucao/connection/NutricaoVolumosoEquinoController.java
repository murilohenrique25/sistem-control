package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoVolumosoEquinoController {

    @Autowired
    private NutricaoVolumosoEquinoRepository nutricaoVolumosoRepository;

    @GetMapping(value = "/nutricaovolumosoequino/todos")
    public ResponseEntity<List<NutricaoVolumosoEquino>> listarTodos() {
        return new ResponseEntity<>(nutricaoVolumosoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaovolumosoequino/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoVolumosoEquino> salvar(@RequestBody NutricaoVolumosoEquino a) {
        NutricaoVolumosoEquino temp = nutricaoVolumosoRepository.save(a);
        return new ResponseEntity<NutricaoVolumosoEquino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaovolumosoequino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoVolumosoRepository.deleteById(id);
        return "Deletado";
    }
}
