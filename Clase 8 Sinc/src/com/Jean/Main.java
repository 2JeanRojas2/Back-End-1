package com.Jean;

import org.apache.log4j.Logger;
import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {

        try {
            Class.forName("org.h2.Driver");
        }
        catch(ClassNotFoundException ex) {
            logger.error("Error: unable to load driver class!");
            System.exit(1);
        }

        String URL = "jdbc:h2:~/test";
        String USER = "sa";
        String PASS = "";

        String sqlCreate =  "CREATE TABLE IF NOT EXISTS FIGURAS (id INT PRIMARY KEY, nombre CHAR(20), color CHAR(20))";
        String sqlInsert = "INSERT INTO figuras VALUES" +
                "(1, 'CIRCULO', 'ROJO'), " +
                "(2, 'CIRCULO', 'VERDE'), " +
                "(3, 'CUADRADO', 'AZUL'), " +
                "(4, 'CUADRADO', 'ROJO'), " +
                "(5, 'CUADRADO', 'AMARILLO');";

        String sqlDelete = "";
        String sqlQuery = "SELECT * FROM FIGURAS WHERE color = 'ROJO' AND nombre = 'CIRCULO'";
        sqlQuery = "SELECT * FROM FIGURAS";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()){

            // stmt.execute(sqlCreate);
            // stmt.executeUpdate(sqlInsert); // or sqlInsert

            ResultSet rs = stmt.executeQuery(sqlQuery);

            while(rs.next()){
                System.out.println(rs.getInt("id") + " -- " + rs.getString("nombre") + " -- " + rs.getString("color"));
            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }
    }
}
