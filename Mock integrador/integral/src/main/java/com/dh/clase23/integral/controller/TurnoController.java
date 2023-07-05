package com.dh.clase23.integral.controller;

import com.dh.clase23.integral.dao.OdontologoDAOH2;
import com.dh.clase23.integral.dao.PacienteDAOH2;
import com.dh.clase23.integral.dao.TurnoLista;
import com.dh.clase23.integral.dominio.Odontologo;
import com.dh.clase23.integral.dominio.Paciente;
import com.dh.clase23.integral.dominio.Turno;
import com.dh.clase23.integral.service.OdontologoService;
import com.dh.clase23.integral.service.PacienteService;
import com.dh.clase23.integral.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    private TurnoService turnoService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        //controlar si los id son existentes
        Paciente paciente= pacienteService.buscar(turno.getPaciente().getId());
        Odontologo odontologo= odontologoService.buscar(turno.getOdontologo().getId());
        //control
        if (paciente!=null&&odontologo!=null){
            //okey, podemos agregar el turno
            respuesta=ResponseEntity.ok(turnoService.registrarTurno(turno));
        }
        else{
            respuesta= ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }
    @GetMapping
    public ResponseEntity<List<Turno>> listarTurnos(){
        return ResponseEntity.ok(turnoService.listar());
    }
}
