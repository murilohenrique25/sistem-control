package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarroteControllerController {

    @Autowired
    private GarroteCorteRepository garroteCorteRepository;

    @GetMapping(value = "/garrotecorte/todos")
    public ResponseEntity<List<GarroteCorte>> listarTodos() {
        return new ResponseEntity<>(garroteCorteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/garrotecorte/salvar")
    @ResponseBody
    public ResponseEntity<GarroteCorte> salvar(@RequestBody GarroteCorte a) {
        GarroteCorte temp = garroteCorteRepository.save(a);
        return new ResponseEntity<GarroteCorte>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/garrotecorte/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        garroteCorteRepository.deleteById(id);
        return "Deletado";
    }
}
