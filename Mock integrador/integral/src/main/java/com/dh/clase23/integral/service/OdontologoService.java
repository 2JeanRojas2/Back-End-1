package com.dh.clase23.integral.service;

import com.dh.clase23.integral.dao.IDao;
import com.dh.clase23.integral.dominio.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public List<Odontologo> buscarTodos(){
        return odontologoIDao.listarElementos();
    }

    public Odontologo buscar(int id){
        return odontologoIDao.buscarId(id);
    }
}
