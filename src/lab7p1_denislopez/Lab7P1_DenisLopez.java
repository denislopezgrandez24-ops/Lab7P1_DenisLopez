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
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz n (1-5):"));
                    if (n <= 0 || n >= 6){
                      String salida="Error: el tamaño debe ser mayor que 0 y menor que 6";
                      JOptionPane.showMessageDialog(null, salida);
                    }
                    int [][] matrizZ = genMatriz(n);
                    imprimirconJOPtion(matrizZ);
                    int codigo = sumaZ(matrizZ);
                    JOptionPane.showMessageDialog(null, "Código secreto (suma de la Z): " + codigo);
                    estadisticas(matrizZ);
                    break;
                }
                case 2:{
                    int matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz: "));
                    if(matriz<3){
                      String salida="Ingrese un tamano valido: "; 
                      JOptionPane.showMessageDialog(null,salida);
                    }
                    int [][]fibonacci=matrizFibonacci(matriz);
                    imprimirconJOPtion(fibonacci);
                    multiplicarDiagonales(fibonacci);
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
    
    public static int sumaZ(int [][] matriz){
        int acum=0;
         for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 if(i==matriz.length-1-j){
                     acum += matriz[i][j];
                 }
             }
         }
        
        for(int j=0;j<matriz.length;j++){
          acum+=matriz[0][j];
          if(matriz.length>1){
           acum += matriz[matriz.length-1][j];   
          }
        }
        return acum;
    }
    
    public static void estadisticas(int[][]matriz){
        int x = matriz.length;
        int cont = 0;
        int suma = 0;
        int max = 0;
        int min = 0;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i == 0||i == x-1 || i == x-1-j){
                int val = matriz[i][j];
                    cont++;
                    suma += val;
                    if(max == 0 || val > max){
                        max = val;
                    }
                    if(min == 0 || val < min){
                        min = val;
            }
            }
        }
        double prom = (double)suma / cont;
        String msg = "Estadísticas de la Z:\n"+"Elementos: "+cont+"\n"+"Máximo: "+max+"\n"+"Mínimo: "+min+"\n"+"Promedio: "+prom;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static int[][] matrizFibonacci(int x){
        int[][] temp = new int[x][x];
        int matriz = x*x;
        int a= 1;
        int b= 1;
        for(int i=0;i<matriz;i++){
            int valor;
            if(i==0 || i==1){
                valor=1;
            } 
            else{
                int c=a+b;
                valor = c;
                a=b;
                b=c;
            }
            int fila = i / x;
            int columna = i % x;
            temp[fila][columna] = valor;
        }
        return temp;
    }
    
    
    public static void multiplicarDiagonales(int [][] x){
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
         String salida="Total Diagonal#1:"+temp[0]+"\n Total Diagonal#2:"+temp[1]+"\n Total final:"+temp[2];
         JOptionPane.showMessageDialog(null,salida);
        
    }
    
    public static void permutaciones(int[][] x, int indice){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                
            } 
        }
    }
    
    
    
    public static int factoriales(int x){
        int factorial = 1;
        for(int i=2;i<=x;i++){
            factorial *= i;
        }
        return factorial;
    }
    
}

