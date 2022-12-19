package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TerminacaoController {

    @Autowired
    private TerminacaoRepository terminacaoRepository;

    @GetMapping(value = "/terminacao/todos")
    public ResponseEntity<List<Terminacao>> listarTodos() {
        return new ResponseEntity<>(terminacaoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/terminacao/salvar")
    @ResponseBody
    public ResponseEntity<Terminacao> salvar(@RequestBody Terminacao a) {
        Terminacao temp = terminacaoRepository.save(a);
        return new ResponseEntity<Terminacao>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/terminacao/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        terminacaoRepository.deleteById(id);
        return "Deletado";
    }
}
