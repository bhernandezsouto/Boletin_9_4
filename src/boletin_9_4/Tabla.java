/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_4;

import javax.swing.JOptionPane;

public class Tabla {
    private int numero;
    public Tabla(){
        String respuesta = JOptionPane.showInputDialog("Introduce un numero");
        numero = Integer.parseInt(respuesta);
    }
    public void tablaMul(){
        String tabla;
        tabla="";
        for (int i=1; i<=12;i++){
            tabla= tabla +("" + numero + " * " + i + " = " + (numero*i) + "\n");
        }
        JOptionPane.showMessageDialog(null, tabla);
    }
}
