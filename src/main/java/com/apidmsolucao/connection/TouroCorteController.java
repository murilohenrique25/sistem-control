package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouroCorteController {

    @Autowired
    private TouroCorteRepository touroCorteRepository;

    @GetMapping(value = "/tourocorte/todos")
    public ResponseEntity<List<TouroCorte>> listarTodos() {
        return new ResponseEntity<>(touroCorteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/tourocorte/salvar")
    @ResponseBody
    public ResponseEntity<TouroCorte> salvar(@RequestBody TouroCorte a) {
        TouroCorte temp = touroCorteRepository.save(a);
        return new ResponseEntity<TouroCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tourocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        touroCorteRepository.deleteById(id);
        return "Deletado";
    }
}
