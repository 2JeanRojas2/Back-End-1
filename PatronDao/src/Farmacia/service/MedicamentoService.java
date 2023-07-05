package Farmacia.service;

import Farmacia.DAOs.IDAO;
import Farmacia.entities.Medicamento;

public class MedicamentoService {
    private IDAO<Medicamento> medicamentoIDAO;

    public IDAO<Medicamento> getMedicamentoIDAO() {
        return medicamentoIDAO;
    }

    public void setMedicamentoIDAO(IDAO<Medicamento> medicamentoIDAO) {
        this.medicamentoIDAO = medicamentoIDAO;
    }

    public Medicamento guardarMedicamento(Medicamento m) {
        return medicamentoIDAO.guardar(m);
    }

    public Medicamento buscarMedicamento(Long id) {
        return medicamentoIDAO.buscar(id);
    }
}
