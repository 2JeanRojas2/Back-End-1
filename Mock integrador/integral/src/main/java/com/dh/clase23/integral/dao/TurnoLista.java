package com.dh.clase23.integral.dao;

import com.dh.clase23.integral.dominio.Odontologo;
import com.dh.clase23.integral.dominio.Paciente;
import com.dh.clase23.integral.dominio.Turno;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public class TurnoLista implements IDao<Turno>{
    private List<Turno> turnos;

    public TurnoLista(){
        turnos=new ArrayList<>();
        PacienteDAOH2 pacienteDAOH2= new PacienteDAOH2();
        OdontologoDAOH2 odontologoDAOH2= new OdontologoDAOH2();
        Paciente paciente= pacienteDAOH2.buscarId(1);
        Odontologo odontologo= odontologoDAOH2.buscarId(1);
        Turno turno= new Turno(1,paciente,odontologo, LocalDate.of(2022,03,01));
        turnos.add(turno);
    }
    @Override
    public List<Turno> listarElementos() {
        return turnos;
    }

    @Override
    public Turno buscarId(int id) {
        for (Turno turno:turnos) {
            if (turno.getId()==id){
                return turno;
            }
        }
        return null;
    }

    @Override
    public Turno buscarEmail(String email) {
        return null;
    }

    @Override
    public Turno guardar(Turno elemento) {
        turnos.add(elemento);
        return elemento;
    }

    @Override
    public Turno actualizar(Turno elemento) {
        eliminar(elemento.getId());
        turnos.add(elemento);
        return elemento;
    }

    @Override
    public void eliminar(int id) {
        for (Turno turno:turnos) {
            if (turno.getId()==id){
                turnos.remove(turno);
            }
        }
    }
}
