/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Login;
import view.mainWindows;

/**
 *
 * @author metallica
 */
public class mainWindowsController {
    mainWindows vMain;

    public mainWindowsController(mainWindows v) {
        vMain=v;
        initAction();
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
    }
    
}
