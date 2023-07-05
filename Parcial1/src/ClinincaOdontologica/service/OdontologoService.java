package ClinincaOdontologica.service;

import ClinincaOdontologica.DAOs.IDAO;
import ClinincaOdontologica.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDAO<Odontologo> odontologoDao;

    public OdontologoService(){
    }

    public OdontologoService (IDAO<Odontologo> odontologoDao){
        this.odontologoDao = odontologoDao;
    }

    public void setOdontologoDao(IDAO<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo) {
        odontologoDao.guardar(odontologo);
        return odontologo;
    }

    public List<Odontologo> listarTodos(){
        return odontologoDao.listarTodos();
    }
}
