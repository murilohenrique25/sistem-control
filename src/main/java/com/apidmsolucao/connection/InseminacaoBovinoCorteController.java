package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InseminacaoBovinoCorteController {

    @Autowired
    private InseminacaoBovinoCorteRepository inseminacaoRepository;

    @GetMapping(value = "/inseminacaobovinocorte/todos")
    public ResponseEntity<List<InseminacaoBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(inseminacaoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/inseminacaobovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<InseminacaoBovinoCorte> salvar(@RequestBody InseminacaoBovinoCorte a) {
        InseminacaoBovinoCorte temp = inseminacaoRepository.save(a);
        return new ResponseEntity<InseminacaoBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/inseminacaobovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        inseminacaoRepository.deleteById(id);
        return "Deletado";
    }
}
