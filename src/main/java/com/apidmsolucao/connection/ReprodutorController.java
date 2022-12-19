package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReprodutorController {

    @Autowired
    private ReprodutorRepository reprodutorRepository;

    @GetMapping(value = "/reprodutor/todos")
    public ResponseEntity<List<Reprodutor>> listarTodos() {
        return new ResponseEntity<>(reprodutorRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/reprodutor/salvar")
    @ResponseBody
    public ResponseEntity<Reprodutor> salvar(@RequestBody Reprodutor a) {
        Reprodutor temp = reprodutorRepository.save(a);
        return new ResponseEntity<Reprodutor>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/reprodutor/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        reprodutorRepository.deleteById(id);
        return "Deletado";
    }
}
