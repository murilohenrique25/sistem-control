package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoteBovinoCorteController {

    @Autowired
    private LoteBovinoCorteRepository loteRepository;

    @GetMapping(value = "/lotebovinocorte/todos")
    public ResponseEntity<List<LoteBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(loteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/lotebovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<LoteBovinoCorte> salvar(@RequestBody LoteBovinoCorte a) {
        LoteBovinoCorte temp = loteRepository.save(a);
        return new ResponseEntity<LoteBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/lotebovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        loteRepository.deleteById(id);
        return "Deletado";
    }
}
