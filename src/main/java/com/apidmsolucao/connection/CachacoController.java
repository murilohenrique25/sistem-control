package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CachacoController {

    @Autowired
    private CachacoRepository cachacoRepository;

    @GetMapping(value = "/cachaco/todos")
    public ResponseEntity<List<Cachaco>> listarTodos() {
        return new ResponseEntity<>(cachacoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/cachaco/salvar")
    @ResponseBody
    public ResponseEntity<Cachaco> salvar(@RequestBody Cachaco a) {
        Cachaco temp = cachacoRepository.save(a);
        return new ResponseEntity<Cachaco>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/cachaco/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        cachacoRepository.deleteById(id);
        return "Deletado";
    }
}
