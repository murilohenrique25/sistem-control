package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoteController {

    @Autowired
    private LoteRepository loteRepository;

    @GetMapping(value = "/lote/todos")
    public ResponseEntity<List<Lote>> listarTodos() {
        return new ResponseEntity<>(loteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/lote/salvar")
    @ResponseBody
    public ResponseEntity<Lote> salvar(@RequestBody Lote a) {
        Lote temp = loteRepository.save(a);
        return new ResponseEntity<Lote>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/lote/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        loteRepository.deleteById(id);
        return "Deletado";
    }
}
