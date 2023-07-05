package ClinincaOdontologica.DAOs;

import ClinincaOdontologica.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements IDAO<Odontologo> {
    private Logger logger = Logger.getLogger(OdontologoDAOH2.class);

    private static final String DB_JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/odontologico;INIT=RUNSCRIPT FROM 'classpath:create.sql'";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";


    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS VALUES (?, ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM ODONTOLOGOS WHERE numeroMatricula = ?";
    private static final String SQL_ALL = "SELECT * FROM ODONTOLOGOS";

    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setLong(1, odontologo.getNumeroMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.executeUpdate();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_ALL);
            while (resultSet.next()) {
                logger.info("El numero de matricula es: " + resultSet.getLong(1) +
                        ", el nombre es: " + resultSet.getString(2) +
                        ", el apellido es: " + resultSet.getString(3) + ".");
            }

            preparedStatement.close();
        } catch (ClassNotFoundException ex) {
            logger.error(ex.toString());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM ODONTOLOGOS");

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                Long numeroMatricula = result.getLong("numeroMatricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                odontologos.add(new Odontologo(1L, "Andres", "Lopez"));
            }
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            logger.error(ex.toString());
        }
        return odontologos;
    }

}
