package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoVolumosoBovinoCorteController {

    @Autowired
    private NutricaoVolumosoBovinoCorteRepository nutricaoVolumosoRepository;

    @GetMapping(value = "/nutricaovolumosobovinocorte/todos")
    public ResponseEntity<List<NutricaoVolumosoBovinoCorte>> listarTodos() {
        return new ResponseEntity<>(nutricaoVolumosoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaovolumosobovinocorte/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoVolumosoBovinoCorte> salvar(@RequestBody NutricaoVolumosoBovinoCorte a) {
        NutricaoVolumosoBovinoCorte temp = nutricaoVolumosoRepository.save(a);
        return new ResponseEntity<NutricaoVolumosoBovinoCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaovolumosobovinocorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoVolumosoRepository.deleteById(id);
        return "Deletado";
    }
}
