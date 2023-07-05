package com.Jean;

import org.apache.log4j.Logger;
import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws Exception {

        Pacientes paciente = new Pacientes("Jean", "Rojas", "Mc casa 19", 1234, "20/09/2021", "Jeanrojas", "123445" );

        try {
            Class.forName("org.h2.Driver");
        }
        catch (ClassNotFoundException ex){
            logger.error("Error: unable to load driver class!");
            System.exit(1);
        }

        String sqlCreate =  "CREATE TABLE IF NOT EXISTS Pacientes (" +
                "ID INT PRIMARY KEY, " +
                "NOMBRE VARCHAR(20)," +
                "APELLIDO VARCHAR(20)," +
                "DOMICILIO VARCHAR(50)," +
                "DNI INT," +
                "FECHADEALTA VARCHAR(20)," +
                "USUARIO VARCHAR(50)," +
                "CONTRASENIA VARCHAR(30)" +
                ")";

        String sqlInsert = "INSERT INTO Pacientes" +
                "(ID, NOMBRE, APELLIDO, DOMICILIO, DNI, FECHADEALTA, USUARIO, CONTRASENIA) VALUES(?,?,?,?,?,?,?,?)";
        String sqlUpdate = "UPDATE Pacientes SET contrasenia =? ";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa", "");
             Statement stmt = conn.createStatement();

            stmt.execute(sqlCreate);
            PreparedStatement psInsert = conn.prepareStatement(sqlInsert);
            psInsert.setInt(1,6);
            psInsert.setString(2,paciente.getNombre());
            psInsert.setString(3, paciente.getApellido());
            psInsert.setString(4, paciente.getDomicilio());
            psInsert.setInt(5, paciente.getDni());
            psInsert.setString(6, paciente.getFechaDeAlta());
            psInsert.setString(7, paciente.getUsuario());
            psInsert.setString(8, paciente.getContrasenia());

            psInsert.execute();

            conn.setAutoCommit(false);

            PreparedStatement psUpdate = conn.prepareStatement(sqlUpdate);
            psUpdate.setString(1, "34567");
            psUpdate.execute();

            conn.commit();

            conn.setAutoCommit(true);

            String sqlQuery = "SELECT * FROM Pacientes";
            ResultSet rs = stmt.executeQuery(sqlQuery);
            while (rs.next()){
                System.out.println("ID: " +  rs.getInt(1) + " nombre: "  + rs.getString(2) + " Apellido: " + rs.getString(3)
                                   + " Domicilio: " + rs.getString(4) + " DNI: " + rs.getInt(5) + " Fecha de alta: " + rs.getString(6)
                                   + " Usuario: " +  rs.getString(7) + " Contraseña: " +  rs.getString(8));
            }

        }catch (SQLException ex){
            logger.error(ex.getMessage());
            conn.rollback();
        }finally {
            conn.close();
        }
    }

}
