package com.Jean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws Exception {

	 Class.forName("org.h2.Driver"); // registrar el controlador

        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement stmt = connection.createStatement();

        String createTable = "DROP TABLE IF EXISTS TEST; CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        stmt.execute(createTable);

        String insertarFila = "INSERT INTO TEST VALUES(1, 'DIGITAL')";
        String insertarFila2 = "INSERT INTO TEST VALUES(2, 'GOOGLE')";
        String insertarFila3 = "INSERT INTO TEST VALUES(3, 'FACEBOOK')";

        stmt.execute(insertarFila);
        stmt.execute(insertarFila2);
        stmt.execute(insertarFila3);

        String sql = "SELECT * FROM TEST";
        ResultSet rd = stmt.executeQuery(sql);
        while(rd.next()){
            Empleado empleado = new Empleado();
            Empleado.setId(rd.getInt(1));
            Empleado.setNombre(rd.getString("Jean"));

            System.out.println(rd.getInt(1) + rd.getString(2));
        }

    }
}
