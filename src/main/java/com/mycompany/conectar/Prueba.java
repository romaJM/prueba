/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conectar;

import java.sql.Connection;

/**
 *
 * @author JachaMon
 */
public class Prueba {
    
    public static void main(String... args){
        Connection conexion = Conexion.abrirConexion();
        if(conexion != null){
            System.out.println("Conexión Exitosa");
            Conexion.cerrarConexion();
        }else{
            System.out.println("Falló Conexión");
        }
    }
}