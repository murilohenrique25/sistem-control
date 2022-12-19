package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CavaloController {

    @Autowired
    private CavaloRepository cavaloRepository;

    @GetMapping(value = "/cavalo/todos")
    public ResponseEntity<List<Cavalo>> listarTodos() {
        return new ResponseEntity<>(cavaloRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/cavalo/salvar")
    @ResponseBody
    public ResponseEntity<Cavalo> salvar(@RequestBody Cavalo a) {
        Cavalo temp = cavaloRepository.save(a);
        return new ResponseEntity<Cavalo>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/cavalo/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        cavaloRepository.deleteById(id);
        return "Deletado";
    }
}
