import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // rango inicial ; rango final ; incremento
        // [0-5]
        /* Pide por teclado 10 numeros y di de todos ellos:
           - cuantos son pares
           - cuantos son impares
           - el número medio introducido
        */
        Scanner scanner = new Scanner(System.in);
        // primero, realizar una variable contador, fuera del bucle, porque sino siempre valdría cero en cada repetición
        int contadorPares = 0, contadorImpares = 0;
        int sumatorio = 0;
        // calcular cual es el más grande y cual es el más pequeño?? * pendiente de hacer
        /* for(int i = 0; i < 5; i++) {
            //System.out.println("Línea de ejecución repetida");
            System.out.println("Introduce un número en posición "+i);
            int numero = scanner.nextInt();
            if (numero %2 == 0){
                contadorPares++;
            } else {
                contadorImpares++;
            }
            sumatorio +=numero;
        }
        System.out.println("Saliendo del for");
        System.out.println("El número de pares es "+contadorPares);
        System.out.println("El número de impares es "+contadorImpares);
        System.out.println("El número de medio itnroducido es "+sumatorio/5);

        */

        // cuando estoy con un for en decremento, hay que empezar por el número más alto
       /* for ( int i = 10; i >= 0; i--) {
            System.out.println("Ejecución de línea repetida "+i);
        }
        */

        // Tabla de multiplicar del 5
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", 5, i, 5 * i);
        }
    }
}
