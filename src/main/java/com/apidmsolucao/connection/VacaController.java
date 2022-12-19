package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VacaController {

    @Autowired
    private VacaRepository vacaRepository;

    @GetMapping(value = "/vaca/todos")
    public ResponseEntity<List<Vaca>> listarTodos() {
        return new ResponseEntity<>(vacaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/vaca/salvar")
    @ResponseBody
    public ResponseEntity<Vaca> salvar(@RequestBody Vaca a) {
        Vaca temp = vacaRepository.save(a);
        return new ResponseEntity<Vaca>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/vaca/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        vacaRepository.deleteById(id);
        return "Deletado";
    }
}
