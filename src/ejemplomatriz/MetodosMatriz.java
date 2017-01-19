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
public class MetodosMatriz {

    int[][] notas = new int[3][4];

    public void cargarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                notas[f][c] = pedirNota();

            }
        }
    }

    public int pedirNota() {
        int resultado;
        do {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("Indica la nota:"));
        } while (resultado < 1 || resultado > 10);
        return resultado;
    }

    public void mostrarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                System.out.println(notas[f][c] + " ");
            }
            System.out.println("\n");
        }
    }

    public float notaMedia() {
        int sumaNotas=0,numeroDeNotas=0;
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                numeroDeNotas++;
                sumaNotas+=notas[f][c];
            }
        }
        //return sumaNotas/numeroDeNotas;
        //tb podriamos usar esto. notas.length nos da el numero de filas
        //y notas[0] el numero de columnas(si el nº de columnas fuese diferente 
        //para cada fila este metodo no nos serviria)
        return sumaNotas/(notas.length*notas[0].length);
    }
}
