package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistroPartoBovinoCorteController {

    @Autowired
    private RegistroPartoBovinoCorteRepository registroPartoBovinoCorteRepository;

    @GetMapping(value = "/registropartobovinocorte/todos")
    public ResponseEntity<List<RegistroPartoBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(registroPartoBovinoCorteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/registropartobovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<RegistroPartoBovinoCorte> salvar(@RequestBody RegistroPartoBovinoCorte a) {
        RegistroPartoBovinoCorte temp = registroPartoBovinoCorteRepository.save(a);
        return new ResponseEntity<RegistroPartoBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/registropartobovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        registroPartoBovinoCorteRepository.deleteById(id);
        return "Deletado";
    }
}
