import javax.swing.plaf.synth.SynthToggleButtonUI;
import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado;



    public void ejercicio1(){
        /* Haga una aplicación que permita introducir el número de bebidas y bocadillos
        comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada bebida
        (valores entre 0.00 y 3.00) y de cada bocadillo (el valor entre 0.00 y 5.00).
        También se podrá introducir el número de alumnos que realizaron la compra
        (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las bebidas
        y de los bocadillos) y la cantidad que debe pagar cada alumno redondeada a 2 decimales.
        */

        lectorTeclado = new Scanner(System.in);
        // 1 -> pedir cosas por teclado
        // 2 -> guardar cosas en variables

        System.out.println("¿Cuántas bebidas vas a comprar?");
        int bebidas = lectorTeclado.nextInt();
        System.out.println("¿Cuántos bocadillos vas a comprar?");
        int bocadillos = lectorTeclado.nextInt();
        System.out.println("¿Cuánto vale cada bebida?");
        double precioBebida = lectorTeclado.nextDouble();
        System.out.println("¿Cuánto vale cada bocadillo?");
        double precioBocadillo = lectorTeclado.nextDouble();
        System.out.println("¿Cuántos alumnos han comprado?");
        int numeroAlumnos = lectorTeclado.nextInt();

        // 3 -> realizar cálculos
        double costeBoadillos = bocadillos*precioBocadillo;
        double costeBebidas = bebidas*precioBebida;
        double costeTotal = costeBebidas+costeBoadillos;
        double precioPersona = costeTotal/numeroAlumnos;

        // 4 -> mostrar información
        System.out.printf("El precio total de la compra es %.2f%n",costeTotal);
        System.out.printf("El precio total de las bebidas es %.2f%n",costeBebidas);
        System.out.printf("El precio total de los bocadillos es %.2f%n",costeBoadillos);
        System.out.printf("El precio a pagar cada persona es %.2f%n",precioPersona);
        lectorTeclado.close();
    }

    public void ejercicio2(){
    /* Permítase introducir el valor con IVA de una compra con dos decimales
    (la compra no puede ser superior a 500€ ni inferior a 0€( y el valor del IVA
    de dicha compra /valor entero entre 0 y 25%).
    ¿Cuánto costó la compra sin IVA?
    ¿Cuánto fue el IVA?
    Muéstrese los resultados redondeados a dos decimales.
    Ejemplo:
    Valor de la compra (entre 0.00 y 500.000): 298,45
    IVA (entre 0 y 25%): 12
    Compra: 266,47€
    IVA: 31,98€
    */
    }

    public void ejercicio3(){
    /* Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
    centenas, decenas y unidades), y se obtiene el número correspondiente.
    Ejemplo:
    Decenas de mil: 7
    Unidades de mil: 9
    Centenas: 0
    Decenas: 5
    Unidades: 0
    */
    }

    public void ejercicio4(){
        /*
        Hágase un programa que convierta segundos en horas, minutos y segundos.
        */
        // 1 -> pedir datos
        lectorTeclado = new Scanner(System.in);
        System.out.println("¿Cúantos segundos quieres convertir?");
        int segundos = lectorTeclado.nextInt();
        // 2 -> realizar cálculos
            // segundos en horas -> 3600
            // minutos en horas -> 60
            // segundos en minutos -> 60
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        int segundosActuales = segundos%60;
        // 3 -> mostrar datos
        System.out.println("El número de horas es "+horas);
        System.out.println("El número de minututos es "+minutos);
        System.out.println("El número de segundos es "+segundosActuales);

        lectorTeclado.close();
    }
}
