/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metallica
 */
public class personal {
    public int ci;
    public String nombre;
    public String usuario;
    public int cel;
    public int rol;
    
    public int getCi(){
        return ci;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public int getCel(){
        return cel;
    }
    
    public String getRol(){
        if(rol==0) return "trabajador";
        else if(rol==1) return "administrativo";
        else return null;
    }
    
    public void setPersonal(int ci,String nombre,String usuario,int cel,String rol){
        this.ci=ci;
        this.nombre=nombre;
        this.usuario=usuario;
        this.cel=cel;
        if(rol.equals("trabajador")) this.rol=0;
        else if(rol.equals("administrativo")) this.rol=1;
    }
}
