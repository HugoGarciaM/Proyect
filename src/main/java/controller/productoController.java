/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.db;
import model.productoModel;
import view.producto;

/**
 *
 * @author metallica
 */
public class productoController extends db{
    producto vproducto;
    productoModel model;
    int id;
    public productoController(producto p,productoModel id) {
        vproducto=p;
        model=id;
        load();
        initAction();
    }
    
    public void initAction(){
        vproducto.btn_reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String sql="insert into transaccion values(null,(?),null,(?),null)";
                    PreparedStatement query=con.prepareStatement(sql);
                    query.setString(1, "");
                    query.setString(2, new dataTime().fechaActual());
                    ResultSet result=query.executeQuery();
                    if(result.next()){
                        
                    }
                }catch(SQLException e){
                    System.out.println("error compra: "+e);
                }
            }
        });
    }
    
    /*public int existCliente(){
        try{
            String sql="select id from cliente where nombre=(?)";
            PreparedStatement query=con.prepareStatement(sql);
            query.setString(1, nombre);
            ResultSet result=query.executeQuery();
            if(result.next()){
                return result.getInt("id");
            }else{
                result.close();
                query.close();
                sql="insert into cliente values(null,(?),(?),(?)";
                query=con.prepareStatement(sql);
                query.setString(1, vproducto.txt_nombre.getText());
                query.setString(2, vproducto.txt_telefono.getText());
                query.setString(3, vproducto.txt_direccion.getText());
                result=query.executeQuery();
                if()
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }*/
    
    
    public void load(){
        vproducto.lblProducto.setText(model.nombre);
        vproducto.txt_precio_produc.setText(String.valueOf(model.precio));
    }
    
}
