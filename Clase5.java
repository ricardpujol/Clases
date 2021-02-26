package clases;

public class Clase5 {
    public static void main(String[] args) {
        String mensaje;
        bucle1:
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
        System.out.println("fuera de k");


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
