package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrecoCarneSuinaController {

    @Autowired
    private PrecoCarneSuinaRepository precoCarneSuinaRepository;

    @GetMapping(value = "/precocarnesuina/todos")
    public ResponseEntity<List<PrecoCarneSuina>> listarTodos() {
        return new ResponseEntity<>(precoCarneSuinaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/precocarnesuina/salvar")
    @ResponseBody
    public ResponseEntity<PrecoCarneSuina> salvar(@RequestBody PrecoCarneSuina a) {
        PrecoCarneSuina temp = precoCarneSuinaRepository.save(a);
        return new ResponseEntity<PrecoCarneSuina>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/precocarnesuina/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        precoCarneSuinaRepository.deleteById(id);
        return "Deletado";
    }
}
