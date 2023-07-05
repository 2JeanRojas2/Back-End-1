package Farmacia.DAOs.impl;

import Farmacia.DAOs.IDAO;
import Farmacia.entities.Medicamento;
import org.apache.log4j.Logger;

import java.sql.*;

public class MedicamentoDAOH2 implements IDAO<Medicamento> {
    private Logger logger = Logger.getLogger(MedicamentoDAOH2.class);

    private static final String DB_JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test"; // Cambiar a lo que use c/u, a mi solo me funciona con server.
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    private static final String SQL_INSERT = "INSERT INTO MEDICAMENTOS VALUES (?, ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM MEDICAMENTOS WHERE ID = ?";
    private static final String SQL_ALL = "SELECT * FROM MEDICAMENTOS";

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setLong(1, medicamento.getId());
            preparedStatement.setString(2, medicamento.getNombreMedicamento());
            preparedStatement.setString(3, medicamento.getEmpresaMedicamento());
            preparedStatement.executeUpdate();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_ALL);
            while(resultSet.next()) {
                logger.info("El ID es: " + resultSet.getLong(1) +
                ", el nombre es: " + resultSet.getString(2) +
                ", el fabricante es: " + resultSet.getString(3) + ".");
            }

            preparedStatement.close();
        } catch (ClassNotFoundException ex) {
           logger.error(ex.toString());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Medicamento medicamento = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement(SQL_SELECT);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                logger.info("El ID es: " + resultSet.getLong(1));
            }
            preparedStatement.close();
        } catch (ClassNotFoundException ex) {
            logger.error(ex.toString());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return medicamento;
    }
}
