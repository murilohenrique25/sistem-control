package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PotroController {

    @Autowired
    private PotroRepository potroRepository;

    @GetMapping(value = "/potro/todos")
    public ResponseEntity<List<Potro>> listarTodos() {
        return new ResponseEntity<>(potroRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/potro/salvar")
    @ResponseBody
    public ResponseEntity<Potro> salvar(@RequestBody Potro a) {
        Potro temp = potroRepository.save(a);
        return new ResponseEntity<Potro>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/potro/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        potroRepository.deleteById(id);
        return "Deletado";
    }
}
