/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metallica
 */
public class producto {
    public int id;
    public String nombre;
    public int tipo;
    public float precio;
    public int cantidad;
    
    
    public void setProducto(String nombre,int tipo,float precio,int cantidad){
        this.nombre=nombre;
        this.tipo=tipo;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
