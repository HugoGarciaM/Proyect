/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metallica
 */
public class cliente {
    public int id;
    public String nombre;
    public int tel;
    public String dir;
    
    
    public void setUser(String nombre,int tel,String dir){
        this.nombre=nombre;
        this.tel=tel;
        this.dir=dir;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getTel(){
        return tel;
    }
    
    public String getDir(){
        return dir;
    }
}
