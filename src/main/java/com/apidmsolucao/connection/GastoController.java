package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GastoController {

    @Autowired
    private GastoRepository gastoRepository;

    @GetMapping(value = "/gasto/todos")
    public ResponseEntity<List<Gasto>> listarTodos() {
        return new ResponseEntity<>(gastoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/gasto/salvar")
    @ResponseBody
    public ResponseEntity<Gasto> salvar(@RequestBody Gasto a) {
        Gasto temp = gastoRepository.save(a);
        return new ResponseEntity<Gasto>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/gasto/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        gastoRepository.deleteById(id);
        return "Deletado";
    }
}
