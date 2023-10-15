/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JachaMon
 */
    public class Conexion {
    private static Connection conexion;
    private static final String usuario = "sa";
    private static final String contraseña = "rjm";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=frutaDB";
    
    public static Connection abrirConexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return conexion;
    }
    
    public static void cerrarConexion(){
        try{
            if(!conexion.isClosed()){
                conexion.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}

