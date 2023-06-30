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
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.db;
import view.Login;
/**
 *
 * @author metallica
 */
public class loginController extends db{
    public Login vlog=null;
    
    public loginController(Login l){
        super();
        vlog=l;
        System.out.println("se inicio controlador");
        initAction();
    }
    
    public void initAction(){
        vlog.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    System.out.println(String.valueOf(vlog.txtContraseña.getPassword()));
                    String sql="select * from personal where usuario=(?) and contraseña=(?)";
                    PreparedStatement query=con.prepareStatement(sql);
                    query.setString(1,vlog.txtUsuario.getText());
                    query.setString(2,String.valueOf(vlog.txtContraseña.getPassword()));
                    ResultSet result=query.executeQuery();
                    if(result.next()) JOptionPane.showMessageDialog(null, "se inicio sesion");
                    else JOptionPane.showMessageDialog(null, "usurio y contraseña no coinciden");
                }catch(SQLException e){
                    System.out.println("error login: "+e);
                }
            }
        });
    }
}
