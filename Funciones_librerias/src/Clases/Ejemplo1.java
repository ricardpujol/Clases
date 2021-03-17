package Clases;

public class Ejemplo1 {

    public static void main(String[] args) {

        int var1=23;
        int operador1=23;
        int operador2=38;
        int resultado=0;

        resultado = sumaEnteros(operador1,operador2);

        System.out.println("El resultado de la suma es "+resultado);
    }

   public static void miFuncion(){
        System.out.println("Hola món");
    }

    public static void miFuncion2(int num){
        System.out.println("Me has pasado un "+num);
        num++;
        System.out.println("Ahora es un "+num);
    }

    public static int sumaEnteros(int op1, int op2){
        return(op1+op2);
    }
}
