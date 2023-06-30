/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                
            }
        });
    }
    
    
    public void load(){
        vproducto.lblProducto.setText(model.nombre);
        vproducto.txt_precio_produc.setText(String.valueOf(model.precio));
    }
    
}
