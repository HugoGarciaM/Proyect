/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package view;

import controller.mainWindowsController;

/**
 *
 * @author metallica
 */
public class Distribuidora {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        mainWindows window=new mainWindows();
        window.setVisible(true);
        new mainWindowsController(window);
        
    }
}
