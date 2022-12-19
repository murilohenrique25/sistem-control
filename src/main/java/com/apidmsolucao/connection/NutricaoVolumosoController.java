package com.apidmsolucao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutricaoVolumosoController {

    @Autowired
    private NutricaoVolumosoRepository nutricaoVolumosoRepository;

    @GetMapping(value = "/nutricaovolumoso/todos")
    public ResponseEntity<List<NutricaoVolumoso>> listarTodos() {
        return new ResponseEntity<>(nutricaoVolumosoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/nutricaovolumoso/salvar")
    @ResponseBody
    public ResponseEntity<NutricaoVolumoso> salvar(@RequestBody NutricaoVolumoso a) {
        NutricaoVolumoso temp = nutricaoVolumosoRepository.save(a);
        return new ResponseEntity<NutricaoVolumoso>(temp, HttpStatus.OK);
    }

    @DeleteMapping(value = "/nutricaovolumoso/deletar")
    @ResponseBody
    public String deletar(@RequestParam Integer id) {
        nutricaoVolumosoRepository.deleteById(id);
        return "Deletado";
    }
}
