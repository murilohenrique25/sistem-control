package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistroPartoCaprinoController {

    @Autowired
    private RegistroPartoCaprinoRepository registroPartoCaprinoRepository;

    @GetMapping(value = "/registropartocaprino/todos")
    public ResponseEntity<List<RegistroPartoCaprino>> listarTodos() {
        return new ResponseEntity<>(registroPartoCaprinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/registropartocaprino/salvar")
    @ResponseBody
    public ResponseEntity<RegistroPartoCaprino> salvar(@RequestBody RegistroPartoCaprino a) {
        RegistroPartoCaprino temp = registroPartoCaprinoRepository.save(a);
        return new ResponseEntity<RegistroPartoCaprino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/registropartocaprino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        registroPartoCaprinoRepository.deleteById(id);
        return "Deletado";
    }
}
