/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionmatriz;

/**
 *
 * @author Angel
 */
public class MultiplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas,columnas,total;
        System.out.println("*********************MATRIZ DE TABLA DE MULTIPLICAR DEL 1 AL 10*********************\n");
        for(filas=1;filas<=10;filas++){
            for(columnas=1;columnas<=10;columnas++){
                 total=filas*columnas;
                 System.out.printf("\t"+total); 
            }
            System.out.println("\n");
        }
    }
    
}
