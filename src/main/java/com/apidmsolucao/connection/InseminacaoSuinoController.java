package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InseminacaoSuinoController {

    @Autowired
    private InseminacaoSuinoRepository inseminacaoSuinoRepository;

    @GetMapping(value = "/inseminacaosuino/todos")
    public ResponseEntity<List<InseminacaoSuino>> listarTodos() {
        return new ResponseEntity<>(inseminacaoSuinoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inseminacaosuino/salvar")
    @ResponseBody
    public ResponseEntity<InseminacaoSuino> salvar(@RequestBody InseminacaoSuino a) {
        InseminacaoSuino temp = inseminacaoSuinoRepository.save(a);
        return new ResponseEntity<InseminacaoSuino>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inseminacaosuino/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inseminacaoSuinoRepository.deleteById(id);
        return "Deletado";
    }
}
