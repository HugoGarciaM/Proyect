/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author metallica
 */
public class db {
    private String host="localhost";
    private String user="root";
    private String password="";
    private String database="agua";
    protected Connection con=null;
    public db(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://"+host+"/"+database+"?user="+user+"&password="+password);
            System.out.println("conectado con exito");
        }catch(SQLException e){
            System.out.println("error de tipo: "+e);
        }
    }
    
    public static void main(String[] args) {
        db a=new db();
    }
}
