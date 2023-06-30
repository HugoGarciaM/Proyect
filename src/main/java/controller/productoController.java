/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.producto;

/**
 *
 * @author metallica
 */
public class productoController {
    producto vproducto;

    public productoController(producto p) {
        vproducto=p;
        initAction();
    }
    
    public void initAction(){
        vproducto.btn_reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
         
            }
        });
    }
    
}
