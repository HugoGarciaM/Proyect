/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.db;
import view.GestionarPedidos;
import view.generarReporte;
import view.gestionarIngresosEgresos;
import view.gestionarTrabajadores;
import view.menuAdministracion;

/**
 *
 * @author HUGO GARCIA
 */
public class menuAdminController extends db{
    public menuAdministracion vm;
    public menuAdminController(menuAdministracion l){
        vm=l;
        initaction();
    }
    
    public void initaction(){
        vm.btn_generar_report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new generarReporte().setVisible(true);
                vm.dispose();
            }
        });
        vm.btn_ges_ingres_egresos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new gestionarIngresosEgresos().setVisible(true);
                vm.dispose();
            }
        } );
        vm.btn_ges_trabajadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new gestionarTrabajadores().setVisible(true);
                vm.dispose();
            }
        });
        vm.btn_gest_pedidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GestionarPedidos().setVisible(true);
                vm.dispose();
            }
        });
    }
}
