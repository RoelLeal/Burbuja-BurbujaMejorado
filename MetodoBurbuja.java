package com.mycompany.metodoburbuja;
import java.util.Scanner;
public class MetodoBurbuja {
    //ANGEL ROEL LEAL ALVARADO ISC 21380638
    static int[] vek = new int[5];
    static int temp = 0, cont = 0;
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        llenadoArreglo();
        ordenamientoArreglo();
        impresionArregloCompleto();
    }
    public static void llenadoArreglo(){
        for(int i = 0; i < 5; i++){
            System.out.print("Ingresa el valor en ["+i+"]: ");
            vek[i] = entrada.nextInt();
        }
    }
    public static void ordenamientoArreglo(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < vek.length-1; j++){
                cont++;
                for(int k = 0; k < 5; k++){
                    System.out.print(vek[k]+" | ");
                }
                if(vek[j] > vek[j+1]){
                    temp = vek[j+1];
                    vek[j+1] = vek[j];
                    vek[j] = temp;
                    System.out.println("El valor: "+vek[j]+" sustituyó el valor: "+vek[j+1]+" cambiado de indice: "+(j+1)+" a indice: "+j);
                }else{
                    System.out.println("No hubo cambios en el arreglo");
                }
            }
        }
    }
    public static void impresionArregloCompleto(){
        System.out.println();
        System.out.println("Numero de interaciones: "+cont);
        System.out.println("El arreglo ordenado nos quedó: ");
        for(int i = 0; i < 5; i++){
            System.out.print(vek[i]+" - ");
        }
    }
}