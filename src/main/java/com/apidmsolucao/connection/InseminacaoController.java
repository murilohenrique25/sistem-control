package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InseminacaoController {

    @Autowired
    private InseminacaoRepository inseminacaoRepository;

    @GetMapping(value = "/inseminacao/todos")
    public ResponseEntity<List<Inseminacao>> listarTodos() {
        return new ResponseEntity<>(inseminacaoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inseminacao/salvar")
    @ResponseBody
    public ResponseEntity<Inseminacao> salvar(@RequestBody Inseminacao a) {
        Inseminacao temp = inseminacaoRepository.save(a);
        return new ResponseEntity<Inseminacao>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inseminacao/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inseminacaoRepository.deleteById(id);
        return "Deletado";
    }
}
