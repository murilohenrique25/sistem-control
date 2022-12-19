package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoComplementarBovinoCorteController {

    @Autowired
    private NutricaoComplementarBovinoCorteRepository nutricaoComplementarRepository;

    @GetMapping(value = "/nutricaocomplementarbovinocorte/todos")
    public ResponseEntity<List<NutricaoComplementarBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(nutricaoComplementarRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaocomplementarbovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoComplementarBovinoCorte> salvar(@RequestBody NutricaoComplementarBovinoCorte a) {
        NutricaoComplementarBovinoCorte temp = nutricaoComplementarRepository.save(a);
        return new ResponseEntity<NutricaoComplementarBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaocomplementarbovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoComplementarRepository.deleteById(id);
        return "Deletado";
    }
}
