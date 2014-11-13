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
        for (int i=1; i<=12;i++){
            JOptionPane.showMessageDialog(null, "" + numero + " * " + i + " = " + (numero*i));
        }
    }
}
