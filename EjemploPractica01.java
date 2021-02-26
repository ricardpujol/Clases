package clases;

import java.util.Scanner;

public class EjemploPractica01 {
    public static void main(String[] args) {
        int numero1=0;
        int numero2=10;
        Scanner escaner=new Scanner(System.in);
        int entrada;
        boolean salir=false;



        do{
            System.out.println("Menú de opciones");
            entrada=escaner.nextInt();
            switch (entrada){
                case 1:
                    System.out.println("¿Cuánto vale el primer número");
                    numero1=escaner.nextInt();
                    break;
                case 2:
                    System.out.println("¿Cuánto vale el segundo número");
                    numero2=escaner.nextInt();
                    break;
                case 3:
                    System.out.println(numero1/numero2);
                case 0:
                    salir=true;
                    break;
                default:
                    System.out.println("El valor introducido no existe");
            }
        } while (salir==false);
    }
}
