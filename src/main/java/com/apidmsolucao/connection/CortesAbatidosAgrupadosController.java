package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CortesAbatidosAgrupadosController {

    @Autowired
    private CortesAbatidosAgrupadosRepository cortesAbatidosAgrupadosRepository;

    @GetMapping(value = "/cortesabatidosagrupados/todos")
    public ResponseEntity<List<CortesAbatidosAgrupados>> listarTodos() {
        return new ResponseEntity<>(cortesAbatidosAgrupadosRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/cortesabatidosagrupados/salvar")
    @ResponseBody
    public ResponseEntity<CortesAbatidosAgrupados> salvar(@RequestBody CortesAbatidosAgrupados a) {
        CortesAbatidosAgrupados temp = cortesAbatidosAgrupadosRepository.save(a);
        return new ResponseEntity<CortesAbatidosAgrupados>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/cortesabatidosagrupados/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        cortesAbatidosAgrupadosRepository.deleteById(id);
        return "Deletado";
    }
}
