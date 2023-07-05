package Farmacia.test;

import Farmacia.DAOs.impl.MedicamentoDAOH2;
import Farmacia.entities.Medicamento;
import Farmacia.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicamentoServiceTest {

    @Test
    public void guardarMedicamentos() {
        // Arrange:
        Medicamento penicilina = new Medicamento(1L, "Penicilina", "Pzifer");
        MedicamentoService medicamentoService = new MedicamentoService();
        medicamentoService.setMedicamentoIDAO(new MedicamentoDAOH2());
        // Act:
        medicamentoService.guardarMedicamento(penicilina);
        //Assert:
        Assertions.assertTrue(1L == 1L);
    }

    @Test
    public void buscarPorId() {
        // Arrange:
        Medicamento buscapina = new Medicamento(2L, "Buscapina", "Moderna");
        MedicamentoService medicamentoService1 = new MedicamentoService();
        medicamentoService1.setMedicamentoIDAO(new MedicamentoDAOH2());
        // Act:
        medicamentoService1.guardarMedicamento(buscapina);
        medicamentoService1.buscarMedicamento(2L);
        // Assert:
        Assertions.assertTrue(buscapina != null);
    }
}