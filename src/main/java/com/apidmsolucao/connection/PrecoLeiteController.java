package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrecoLeiteController {

    @Autowired
    private PrecoLeiteRepository precoLeiteRepository;

    @GetMapping(value = "/precoleite/todos")
    public ResponseEntity<List<PrecoLeite>> listarTodos() {
        return new ResponseEntity<>(precoLeiteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/precoleite/salvar")
    @ResponseBody
    public ResponseEntity<PrecoLeite> salvar(@RequestBody PrecoLeite a) {
        PrecoLeite temp = precoLeiteRepository.save(a);
        return new ResponseEntity<PrecoLeite>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/precoleite/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        precoLeiteRepository.deleteById(id);
        return "Deletado";
    }
}
