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
import model.db;
import model.productoModel;
import view.Login;
import view.mainWindows;
import view.producto;

/**
 *
 * @author metallica
 */
public class mainWindowsController extends db{
    mainWindows vMain;
    productoModel list[]=new productoModel[4];
    int l1=0;
    public mainWindowsController(mainWindows v) {
        super();
        vMain=v;
        initAction();
        loadItems();
    }
    
    public void initAction(){
        vMain.btn_iniciar_sesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Login v=new Login();
                v.setVisible(true);
                new loginController(v);
                vMain.dispose();
            }
        });
        vMain.btn_pro1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                producto v=new producto();
                v.setVisible(true);
                new productoController(v,list[0]);
                vMain.dispose();
            }
        });
        vMain.btn_pro2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                producto v=new producto();
                v.setVisible(true);
                new productoController(v,list[1]);
                vMain.dispose();
            }
        });
        vMain.btn_pro4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                producto v=new producto();
                v.setVisible(true);
                new productoController(v,list[2]);
                vMain.dispose();
            }
        });
        vMain.btn_pro5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                producto v=new producto();
                v.setVisible(true);
                new productoController(v,list[3]);
                vMain.dispose();
            }
        });
    }
    
    
    public void loadItems(){
        try{
            System.out.println("si me cargo");
            list[0]=new productoModel();
            list[1]=new productoModel();
            list[2]=new productoModel();
            list[3]=new productoModel();
            String sql="select id,nombre,precio,cantidad,descripcion from producto limit ?,?";
            PreparedStatement query=con.prepareStatement(sql);
            query.setInt(1, l1);
            query.setInt(2, l1+4);
            ResultSet result=query.executeQuery();
            int i=0;
            while(result.next()){
                list[i].id=result.getInt("id");
                list[i].nombre=result.getString("nombre");
                list[i].precio=result.getFloat("precio");
                list[i].precio=result.getInt("cantidad");
                list[i++].descripcion=result.getString("descripcion");
            }
            vMain.lbl_nombre1.setText(list[0].nombre);
            vMain.lbl_precio1.setText(String.valueOf(list[0].precio));
            vMain.txt_detalle1.setText(list[0].descripcion);
            vMain.lbl_nombre2.setText(list[1].nombre);
            vMain.lbl_precio2.setText(String.valueOf(list[1].precio));
            vMain.txt_datalle2.setText(list[1].descripcion);
            vMain.lbl_nombre3.setText(list[2].nombre);
            vMain.lbl_precio3.setText(String.valueOf(list[2].precio));
            vMain.txt_detalle3.setText(list[2].descripcion);
            vMain.lbl_nombre4.setText(list[3].nombre);
            vMain.lbl_precio4.setText(String.valueOf(list[3].precio));
            vMain.txt_detalle4.setText(list[3].descripcion);
        }catch(SQLException e){
            System.out.println("error al cargar: "+e);
        }
    }
}
