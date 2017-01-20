/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class EjemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosMatriz matriz1=new MetodosMatriz();
        matriz1.cargarMatriz();
        matriz1.mostrarMatriz();
        matriz1.calcularMediaNotasPorAlumno();
        matriz1.mostrarMediaPorAlumno();
        matriz1.calcularNotaMediaPorModulo();
        matriz1.mostrarMediaPorModulo();
    }
}
