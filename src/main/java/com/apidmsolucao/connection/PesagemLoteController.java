package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PesagemLoteController {

    @Autowired
    private PesagemLoteRepository pesagemLoteRepository;

    @GetMapping(value = "/pesagemlote/todos")
    public ResponseEntity<List<PesagemLote>> listarTodos() {
        return new ResponseEntity<>(pesagemLoteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/pesagemlote/salvar")
    @ResponseBody
    public ResponseEntity<PesagemLote> salvar(@RequestBody PesagemLote a) {
        PesagemLote temp = pesagemLoteRepository.save(a);
        return new ResponseEntity<PesagemLote>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/pesagemlote/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        pesagemLoteRepository.deleteById(id);
        return "Deletado";
    }
}
