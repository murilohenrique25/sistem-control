package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GastoBovinoCorteController {

    @Autowired
    private GastoBovinoCorteRepository gastoRepository;

    @GetMapping(value = "/gastobovinocorte/todos")
    public ResponseEntity<List<GastoBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(gastoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/gastobovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<GastoBovinoCorte> salvar(@RequestBody GastoBovinoCorte a) {
        GastoBovinoCorte temp = gastoRepository.save(a);
        return new ResponseEntity<GastoBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/gastobovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        gastoRepository.deleteById(id);
        return "Deletado";
    }
}
