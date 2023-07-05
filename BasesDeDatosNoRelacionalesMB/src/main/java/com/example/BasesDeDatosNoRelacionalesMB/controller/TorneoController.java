package com.example.BasesDeDatosNoRelacionalesMB.controller;

import com.example.BasesDeDatosNoRelacionalesMB.model.Torneo;
import com.example.BasesDeDatosNoRelacionalesMB.service.TorneoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneos")
public class TorneoController {

    private TorneoService service;

    public TorneoController(TorneoService service) {
        this.service = service;
    }

    @PostMapping
    public Torneo guardarTorneo (@RequestBody Torneo t){
        return service.guardar(t);
    }

    @GetMapping
    public List<Torneo> traerTodos(){
        return service.buscarTodos();
    }
}
