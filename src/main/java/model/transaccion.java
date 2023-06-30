/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metallica
 */
public class transaccion {
    public int id;
    public String cliente;
    public String repartidor;
    public String fechaP;
    public String fechaE;
    
    public void setTransaccion(String cliente,String repartidor,String fechaP,String fechaE){
        this.cliente=cliente;
        this.repartidor=repartidor;
        this.fechaE=fechaE;
        this.fechaP=fechaP;
    }
    
    public int getId(){
        return id;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public String getRepartidor(){
        return repartidor;
    }
    
    public String getFechaE(){
        return fechaE;
    }
    public String getFechaP(){
        return fechaP;
    }
}
