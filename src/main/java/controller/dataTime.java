/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HUGO GARCIA
 */
public class dataTime {
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
    return formatoFecha.format(fecha);
}
