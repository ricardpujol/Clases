package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo01 {
    public static void main(String[] args) throws IOException {

        /*double var1=10.0/3;
        int varI=1_154_854_787;
        System.out.println(String.format("%.4f",(12.0/4)));
        System.out.println(String.format("%.3e",(1545450.25)));
        System.out.println(String.format("El importe total es: %,.2f",154787.2547));
        System.out.println(String.format("El valor de varI es: %,d ",varI));*/

        /*Double var1=4.5;
        Double var2=4.5;

        if (var1.equals(var2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada;
        try{
            System.out.println("Introduce un número con decimales");
            entrada=br.readLine();
            double var1= Double.parseDouble(entrada);
        } catch(Exception e) {
            System.out.println("Hay un error");
        }


        /*String estado = "casado";

        System.out.println("Introduce tu estado civil");

        entrada=br.readLine();

        if (entrada.equals(estado)){
            System.out.println("Está casado");
    } else if (entrada.equals("soltero")) {
            System.out.println("Está soltero");
        } else if (entrada.equals("divorciado")){
            System.out.println("Está divorciado");
        }
            else if (entrada.equals("viudo")) {
            System.out.println("Está viudo");
        }
        else {
            System.out.println("Tiene otro estado");
        }*/
}}


