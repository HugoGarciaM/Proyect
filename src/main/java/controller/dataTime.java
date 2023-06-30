/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Calendar;


/**
 *
 * @author HUGO GARCIA
 */
public class dataTime {
    public String fechaActual(){
    Calendar Time =Calendar.getInstance();
    return Time.get(Calendar.DATE)+"-"+(Time.get(Calendar.MONTH)+1)+"-"+Time.get(Calendar.YEAR);
}
}
