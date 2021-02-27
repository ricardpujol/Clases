package clases;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploPractica02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entrada;
        boolean salir = false;
        Double[] miArray = new Double[5];

        System.out.println(miArray.length);


        do {
            System.out.println("**********************************************");
            System.out.println("Elige una de las siguientes opciones:");
            System.out.println("1. Rellenar Array");
            System.out.println("2. Mostrar el Array");
            System.out.println("3. Ordenar y mostrar el Array");
            System.out.println("4. Sumar todos los elementos");
            System.out.println("5. Separar pares e impares -- solo con enteros");
            System.out.println("0. Salir del programa");
            System.out.println("**********************************************");
            System.out.println("Introduce la opción elegida");

            entrada = scanner.next();

            switch (entrada) {
                case "0":
                    salir = true;
                    break;
                case "1":
                    int i = 0;
                    Double aux;
                    while (i < 5) {
                        try {
                            System.out.println("Introduce un valor decimal: ");
                            miArray[i] = scanner.nextDouble();
                            i++;
                        } catch (Exception e) {
                            System.out.println("Has introducido un valor incorrecto");
                            scanner.next();
                        }

                    }
                    break;
                case "2":
                    for (Double num1:miArray){
                        System.out.println("El valor es " + num1);
                    }
                    break;
                case "3":
                    Arrays.sort(miArray);
                    for (Double num1:miArray){
                        System.out.println("El valor es " + num1);
                    };
                    break;
                case "4":
                    Double total=0.0;
                    for (Double num1:miArray){
                        total+=num1;
                    }
                    System.out.println("La suma es " + total);
                    break;
                case "5":
                    Double pares[] = new Double[5];
                    Double impares [] = new Double[5];
                    int a=0, b=0;
                    for (int j = 0; j < miArray.length; j++) {
                        if ((miArray[j]%2)==0){
                            pares[a] = miArray[j];
                            a++;
                        }else{
                            impares[b] = miArray[j];
                            b++;
                        }
                    }
                    System.out.println("Los pares son: ");
                    for (Double numero:pares){
                        if (numero !=null)
                            System.out.println(numero);
                    }
                    System.out.println("Y los impares");
                    for (Double numero:impares){
                        if (numero !=null)
                            System.out.println(numero);
                    }
                    break;
                case "6":
                    double var1;
                    System.out.println("Introduce la posición");
                    var1= scanner.nextDouble();
                    scanner.next();
                    System.out.println("Introduce el valor");
                    miArray[(int) var1] = scanner.nextDouble();

                default:
                    System.out.println("El valor introducido no es correcto");
            }

        } while (!salir);
    }
}
