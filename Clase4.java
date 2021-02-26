package clases;

import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int contador=0;
        int total=0;
        int numero=0;


        do {
            try{
            System.out.println("Introduce un número entero");
            numero = escaner.nextInt();
            total += numero;
            contador++;} catch (Exception e) {
                System.out.println("Has introducido un valor incorrecto");
                escaner.next();
            }
        } while(contador < 4);

        System.out.println("He leído " + contador + "números");
        System.out.println("El total es " + total);


        // Contador


       /* int i;
        i=0;
        while(i<10){
            System.out.println("El valor de la variable 6 x " + i + " es " + i * 6);
            i++;
        } */

       /*for (int i = 0; i <= 10; i++){
            System.out.println("El valor de 6 x " + i + " = " + i *6);
        }*/


        //Bucle infinito
        /*do{
            System.out.println("¿Qué quieres hacer?");

            entrada=escaner.nextLine();

            if (entrada.equals("fuera")){
                //salir=true;
                System.out.println("Me quiero salir del bucle");
            } else {
                salir = false;
                System.out.println("No quiero salir del bucle");
            }

        } while (salir==false);*/

        /* do{
            System.out.println("¿Qué quieres hacer?");

            entrada=escaner.nextLine();

            if (entrada.equals("fuera")){
                salir=true;
                System.out.println("Me quiero salir del bucle");
            } else {
                salir = false;
                System.out.println("No quiero salir del bucle");
            }

        } while (salir==false);*/



        /*do{
            System.out.println("Introduce el color del semáforo:");

            entrada = escaner.nextLine();

            switch (entrada) {
                case "rojo":
                    System.out.println("No pases");
                    break;
                case "verde":
                    System.out.println("Pasa");
                    break;
                case "ámbar":
                    System.out.println("Pasa con cuidado");
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        } while (salir != false);*/

        /*System.out.println("Introduce tu estado civil");*/

        /*entrada=escaner.nextLine();*/

       /* if (entrada.equals("soltero")){
            ayuda=100;
        } else if(entrada.equals("divorciado")){
            ayuda=150;
        } else if (entrada.equals("viudo")) {
            ayuda = 500;
        } else {
            ayuda=0;
        }

        System.out.println("Tu ayuda es de: " + ayuda + " €");*/


        /*System.out.println("Introduce el color del semáforo:");

        entrada=escaner.nextLine()

        if (entrada.equals("rojo")){
            System.out.println("No puedes pasar");
        } else if (entrada.equals("verde")){
            System.out.println("Pasa");
        } else if (entrada.equals("ámbar")){
            System.out.println("Pasa con precaución");
        } else {
            System.out.println("Valor incorrecto");
        } */

    }
}


