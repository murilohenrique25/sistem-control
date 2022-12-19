package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouroController {

    @Autowired
    private TouroRepository touroRepository;

    @GetMapping(value = "/touro/todos")
    public ResponseEntity<List<Touro>> listarTodos() {
        return new ResponseEntity<>(touroRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/touro/salvar")
    @ResponseBody
    public ResponseEntity<Touro> salvar(@RequestBody Touro a) {
        Touro temp = touroRepository.save(a);
        return new ResponseEntity<Touro>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/touro/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        touroRepository.deleteById(id);
        return "Deletado";
    }
}
