package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbatidoController {

    @Autowired
    private AbatidoRepository abatidoRepository;

    @GetMapping(value = "/abatido/todos")
    public ResponseEntity<List<Abatido>> listarTodos() {
        return new ResponseEntity<>(abatidoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/abatido/salvar")
    @ResponseBody
    public ResponseEntity<Abatido> salvar(@RequestBody Abatido abatido) {
        Abatido a = abatidoRepository.save(abatido);
        return new ResponseEntity<Abatido>(a, HttpStatus.OK);
    }

    @DeleteMapping(value = "/abatido/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        abatidoRepository.deleteById(id);
        return "Deletado";
    }
}
