package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VacaCorteController {

    @Autowired
    private VacaCorteRepository vacaRepository;

    @GetMapping(value = "/vacacorte/todos")
    public ResponseEntity<List<VacaCorte>> listarTodos() {
        return new ResponseEntity<>(vacaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/vacacorte/salvar")
    @ResponseBody
    public ResponseEntity<VacaCorte> salvar(@RequestBody VacaCorte a) {
        VacaCorte temp = vacaRepository.save(a);
        return new ResponseEntity<VacaCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/vacacorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        vacaRepository.deleteById(id);
        return "Deletado";
    }
}
