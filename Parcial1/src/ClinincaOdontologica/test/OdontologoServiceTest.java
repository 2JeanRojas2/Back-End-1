package ClinincaOdontologica.test;

import ClinincaOdontologica.DAOs.OdontologoDAOH2;
import ClinincaOdontologica.model.Odontologo;
import ClinincaOdontologica.service.OdontologoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

    @Test
    public void test_listarTodosLosOdontologos(){
        Odontologo odontologo1 = new Odontologo(1L, "Juan", "lopez");
        Odontologo odontologo2 = new Odontologo(2L, "lala", "Perez");
        Odontologo odontologo3 = new Odontologo(3L,"Karen", "Sanches");

        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);
        odontologoService.guardarOdontologo(odontologo3);

        List<Odontologo> resultadoListarTodos = odontologoService.listarTodos();

        Assert.assertTrue( resultadoListarTodos.size() > 0);
    }
}
