import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();


        // si la nota es >5 // si la nota es <7
        switch (nota){
            case 1:
                System.out.println("La nota vale 1, has suspendido con honores");
                break;

            case 5:
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case  10:
                System.out.println("Lo has cuadrado! Perfecto!");
                break;

            default:
                System.out.println("Esta nota no se puede analizar");
        }
    }

    public void estructuraLambda(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        String nombre = scanner.next();
        String apellido = "";

        switch (nombre){
            case "Borja" ->{
                System.out.println("Nombre introducido borja");
                apellido = "asd";
            }
            case "María" ->{
                System.out.println("Nombre introducido maria");
                apellido = "asd";
            }
            case "Juan" ->{
                System.out.println("Nombre introducido juan");
                apellido = "asd";
            }
            case "Marcos" ->{
                System.out.println("Nombre introducido marcos");
                apellido = "asd";
            }
            default ->{
                System.out.println("Nombre introducido no contemplado");
                apellido = "asd";
            }
        }
    }

    public void estructuraChar(){
        char letra = 'A';
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;

            default:
                    System.out.println("No es vocal, es consonante");

        }
    }


    public void menuOpciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor selecciona la opción a realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - División");
        System.out.println("5 - Sumar");
        System.out.println("6 - Sumar");
        System.out.println();
        int opcion = scanner.nextInt();
        int operando1=0, operando2=0;

        if (opcion>=1 && opcion<6){
            System.out.println("Introduce operando 1");
            operando1 = scanner.nextInt();
            System.out.println("Introduce operando 2");
            operando2 = scanner.nextInt();
        }
        double resultado = 0;
        switch (opcion){
            case 1 ->{
                System.out.println("Vas a sumar");
                resultado = operando1+operando2;
            }
            case 2 ->{
                System.out.println("Vas a restar");
                resultado = operando1-operando2;
            }
            case 3 ->{
                System.out.println("Vas a multiplicar");
                resultado = operando1*operando2;
            }
            case 4 ->{
                System.out.println("Vas a dividir");
                resultado = (double)operando1/operando2;
            }
            case 5 ->{
                System.out.println("Vas a dividir");
                resultado = (double)operando1/operando2;
            }
            case 6 ->{
                System.out.println("Vas a dividir");
                resultado = (double)operando1/operando2;
            }
            default -> {
                System.out.println("El resultado obtenido es "+resultado);
            }
        }
    }
}
