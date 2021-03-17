package Clases;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Double operador1, operador2, resultado;
        operador1 = 5.2;
        operador2 = 4.7;
        resultado= 0.0;

        String opcion=mostrarMenu();

        System.out.println("Introduce el primer valor");
        operador1 = leerDouble();
        System.out.println("Introduce el segundo valor");
        operador2 = leerDouble(); // Dentro de estas funciones declaramos scanner, y pedimos Double.

        switch(opcion){

            case "0":
                System.out.println("Adios");
                break;

            case "1":
                resultado = sumaEnteros(operador1,operador2);
                System.out.println(resultado);
                break;

            /*case "2":
                compararNumeros(operador1,operador2);
                break;*/
            default:
                System.out.println("El valor introducido no es correcto");
                break;
        }
}

    private static Double sumaEnteros(Double operador1, Double operador2) {
        return (operador1+operador2);
    }

    private static String mostrarMenu() {

        Scanner scanner = new Scanner(System.in);
        String entrada;
        System.out.println("****************************************");
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1. Sumar números");
        System.out.println("2. Comparar números");
        System.out.println("0. Salir del programa");
        System.out.println("****************************************");
        System.out.println("Introduce la opción elegida");
        
        entrada = scanner.next();
        return entrada;

    }

    private static Double leerDouble() {


        Scanner scanner = new Scanner(System.in);

        Double numero = scanner.nextDouble();

        return numero;
    }
    }
