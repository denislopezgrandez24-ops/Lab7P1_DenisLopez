/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_denislopez;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author djlop
 */
public class Lab7P1_DenisLopez {
     static Scanner leer = new Scanner (System.in);
     static Random R = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las filas: "));
        //int columnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las columnas:" ));
       // int[][]matriz=new int[filas][columnas];
        //matriz=lecturarandom(filas,columnas);
        int op = menu();
        while(op!=4){
            switch(op){
                case 1:{
                    int matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz (1-6): "));
                    int [][]z=genMatriz(matriz);
                    imprimirconJOPtion(z);
                    if(z.length<0&&z.length>6){
                        String salida="Error: el numero debe ser mayor que 0 y menor que 6";
                    }
                    
                    break;
                }
                case 2:{
                    int matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz: "));
                    int [][]diagonal=genMatriz(matriz);
                    imprimirconJOPtion(diagonal);
                    //int[] diagonal=(multiplicarDiagonales(diagonal));
                    String salida="Total Diagonal#1:"+diagonal[0]+"\n Total Diagonal#2:"+diagonal[1]+"\n Total final:"+diagonal[2];
                    JOptionPane.showMessageDialog(null,salida);
                    break;
                }
                case 3:{
                    
                }
                default:{
                    
                }
            }
            op=menu();
        }
    }
    
    public static int menu(){
        String salida="Menu \n 1. Codigo en Z \n 2. Multplicar Diagonales \n 3. Todo lo que veo son Permutaciones \n 4. Salir \n Ingrese su opcion: ";
        int opcion= Integer.parseInt(JOptionPane.showInputDialog(salida));
        return opcion;
    }
    
    public static int [][] lecturarandom(int size1, int size2){
        int temp[][]=new int[size1][size2];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                 temp[i][j]= 1+R.nextInt(99);
            }
    }
      return temp;
        
    }
    
    public static void imprimirconJOPtion(int [][] x){
        String salida="";
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                salida+=x[i][j]+" ";
           
            }
            salida+="\n";
    }
             JOptionPane.showMessageDialog(null,salida);
    }
    
    public static int [][] genMatriz(int size1){
        int temp[][]=new int[size1][size1];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size1;j++){
                 temp[i][j]= 1+R.nextInt(50);
            }
        }
      return temp;
    }
    
    public static int[][] sumaZ(int [][] matriz){
        //int filas=matriz.length;
        //int columnas=matriz[0].length;
        //matriz=new int[filas][columnas];
        int acum=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(i==matriz.length&&i==matriz.length-1){
                   acum+=matriz[i][j];   
                }
                if(i==matriz.length-1-j){
                   acum+=matriz[i][j]; 
                }
            } 
        }
        
        return matriz;
    }
    
    public static void estadisticas(int[][]matriz){
        int acum=0;
        int max=0;
        int min=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
               if(i==matriz.length&&i==matriz.length-1){
                   acum++;   
                }
                if(i==matriz.length-1-j){
                   acum++; 
                } 
            }
        }
    }
    
    public static int[][] matrizFibonacci(int [][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(i-1)+(i-2);
            }
        }
        return matriz;
    }
    
    
    public static int [] multiplicarDiagonales(int [][] x){
        int[]temp=new int [3];
        int acum=0;
        int acum2=0;
        int total=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i==j){
                    acum+=x[i][j];
                    
                }
                if(i==x.length-1-j){
                   acum2+=x[i][j]; 
                }
            }
            total=acum*acum2;
        }
         temp[0]=acum;
         temp[1]=acum2;
         temp[2]=total;
        return temp;
    }
    
   // public static int[] arreglo(int[]x){
    //    int[]temp=new int[2];
        
        
    //}
    
    public static void permutaciones(){
        
    }
    
}

