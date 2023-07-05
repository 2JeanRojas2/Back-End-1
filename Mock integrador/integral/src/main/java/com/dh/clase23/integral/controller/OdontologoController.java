package com.dh.clase23.integral.controller;

import com.dh.clase23.integral.dao.OdontologoDAOH2;
import com.dh.clase23.integral.dominio.Odontologo;
import com.dh.clase23.integral.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public List<Odontologo> buscarTodosOdontologos(){
        return odontologoService.buscarTodos();
    }
}
