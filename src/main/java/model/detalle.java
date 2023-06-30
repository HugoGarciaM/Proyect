/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metallica
 */
public class detalle {
    public int id;
    public String producto;
    public int transaccion;
    public float precio;
    public int cantidad;
    
    public void setUser(String producto,int transaccion,float precio,int cantidad){
        this.producto=producto;
        this.transaccion=transaccion;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    
    public int getId(){
        return id;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public int getTransaccion(){
        return transaccion;
    }
    
    public float getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
}
