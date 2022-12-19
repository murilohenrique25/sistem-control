package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EguaController {

    @Autowired
    private EguaRepository eguaRepository;

    @GetMapping(value = "/egua/todos")
    public ResponseEntity<List<Egua>> listarTodos() {
        return new ResponseEntity<>(eguaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/egua/salvar")
    @ResponseBody
    public ResponseEntity<Egua> salvar(@RequestBody Egua a) {
        Egua temp = eguaRepository.save(a);
        return new ResponseEntity<Egua>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/egua/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        eguaRepository.deleteById(id);
        return "Deletado";
    }
}
