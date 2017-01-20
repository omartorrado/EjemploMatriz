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

    //int[][] notas = new int[3][4];
    float[] notasMediasAlumno = new float[3];
    float[] notasMediasModulo = new float[4];
    
    //usador para no tener que crear la matriz todo el rato. Sino usariamos la
    //variable notas comentada arriba
    int[][] notas={{4,6,5,8},{3,9,6,7},{6,8,9,1}};
    
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

//    public float notaMedia() {
//        int sumaNotas=0,numeroDeNotas=0;
//        for (int f = 0; f < notas.length; f++) {
//            for (int c = 0; c < notas[f].length; c++) {
//                numeroDeNotas++;
//                sumaNotas+=notas[f][c];
//            }
//        }
//        //return sumaNotas/numeroDeNotas;
//        //tb podriamos usar esto. notas.length nos da el numero de filas
//        //y notas[0] el numero de columnas(si el nº de columnas fuese diferente 
//        //para cada fila este metodo no nos serviria)
//        return sumaNotas/(notas.length*notas[0].length);
//    }
    public void calcularMediaNotasPorAlumno() {
        float acumulador;
        for (int f = 0; f < notas.length; f++) {
            acumulador = 0;
            for (int c = 0; c < notas[f].length; c++) {
                acumulador += notas[f][c];
            }
            notasMediasAlumno[f] = acumulador / notas[f].length;
        }
    }

    public void mostrarMediaPorAlumno() {
        for (int i = 0; i < notasMediasAlumno.length; i++) {
            System.out.println("La media de este alumno es de " +notasMediasAlumno[i]);
        }
    }
    
    //el acumuladorAlumnos nos permite ir cambiando de fila cada vez k guardamos
    //una nota en el array notasMediaModulos para que vaya sumando la de cada
    //modulo y despues hacemos la media segun la longitud del array notas
    public void calcularNotaMediaPorModulo(){
            int acumuladorAlumnos=0;
        for(int f=0;f<notas.length;f++){
            acumuladorAlumnos=0;
            for(int c=0;c<notas[f].length;c++){
                //aki usamos acumulador alumnos para elegir en k posicion del 
                //array se suma la nota, para que a pesar de ir por columnas
                //guarde cada columna en diferente fila
                notasMediasModulo[acumuladorAlumnos]+=notas[f][c];
                acumuladorAlumnos++;
            }
            
        }
        for(int m=0;m<notasMediasModulo.length;m++){
        notasMediasModulo[m]=notasMediasModulo[m]/notas.length;
                }
    }
    
    public void mostrarMediaPorModulo() {
        for (int i = 0; i < notasMediasModulo.length; i++) {
            System.out.println("La media de este módulo es de " +notasMediasModulo[i]);
        }
    }
}
