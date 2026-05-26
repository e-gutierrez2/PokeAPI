package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {
    private static final String DB_PATH = "../../database/BasePokemon.db";
    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection(){
        try {
            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_PATH);
            
            // Activar Claves foreaneas 
            try (Statement stmt = connection.createStatement()){
                stmt.execute("PRAGMA foreign_keys = ON");
            }            
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver SQLite no encontrado");
        }
        catch (SQLException e) {
            throw new RuntimeException("Error al conectar a la BBDD");
        }
    }

    public static DatabaseConnection getInstance(){
        if (instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }

    public void close(){
        try{
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
        catch (SQLException e){
            System.err.println("Error al cerrar la connexion: " + e.getMessage());
        }
    }



}
