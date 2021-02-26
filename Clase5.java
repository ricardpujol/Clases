package clases;

import java.util.Scanner;

public class Clase5 {
    public static void main(String[] args) {

        Scanner escaner =new Scanner(System.in);

        Integer[] miArray;

        miArray = new Integer[4];
        miArray[0]=45;
        miArray[1]=100;
        miArray[2]=987;
        miArray[3]=1364;



        /*for (Integer num1:miArray){
            System.out.println("El valor del elemento es: " + num1);
        }*/

        /*for (int i = 0; i < miArray.length ; i++) {
            System.out.println("Introduce un entero");
            miArray[i] = escaner.nextInt();
        }

        for (int i = 0; i < miArray.length ; i++) {
            System.out.println(miArray[i]);
        }*/


        /*bucle1:
        for (int k = 1; k < 5; k++) {
            bucle2:
            for (int l = 1; l < 10; l++) {

                System.out.println("esto es la vuelta (k, l) " + k + " + " + l);

                    if (k ==1 && l == 2){
                        System.out.println("Entro al if y salto");
                        break bucle2;
                    }
                System.out.println("Fuera del if");
            }
            System.out.println("fuera del l");
        }
        System.out.println("fuera de k");*/


        /*for (int i = 0; i < 4; i++) {
            mensaje="Esto es la vuelta "+ i + " del bucle.";
            System.out.println(mensaje);
            if (i==2){
                System.out.println("Dentro del if");
                break;
            }
            System.out.println("Código después del if");
        }
        System.out.println("Código después del for");*/

    }
}
