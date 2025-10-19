import java.util.Scanner;

public class Operadores {

    public void operadoresAritmetico(){
        System.out.println("Explicación de los operadores aritméticos");
        // unarios: solo necesitan un operando
        int operandoUno = 5;
        operandoUno++; // operandoUno = operandoUno + 1;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("Despues de inrementar "+operandoUno);
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("Después de decrementar "+operandoUno);

        operandoUno = -operandoUno; //

        // Binarios
        int operandoDos = 5;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        int resta = operandoUno - operandoDos;
        System.out.printf("");
        int multiplicación = operandoUno * operandoDos;
        System.out.printf("");
        double division = operandoUno/operandoDos;
        System.out.println(division);
        // Casteo:
        double divisionCasteo = (double)operandoUno/operandoDos;
        System.out.printf("El resultado de la división es %.2f",divisionCasteo);
        int modulo = operandoUno%2; // el resto de la división
        System.out.println(modulo);

    }

    public void operadoresAsignacion(){
        int operandoUno = 6;
        operandoUno +=10; // lo mismo que: operandoUno = operandoUno + 10; // 16
        operandoUno -=3; // 13
    }

    public void operadoresComparacion(){
        int numeroUno = 4;
        int numeroDos = 7;

        boolean resultado = numeroUno>numeroDos; // false;
        resultado = numeroUno>=numeroDos; // false
        resultado = numeroUno<numeroDos; // false
    }

    public void operadoresLogicos(){
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos != numeroTres;
    }

    public void evaluarCandidato(){
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = lectorTeclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();
        System.out.println("Qué salario quieres cobrar");
        double salario = lectorTeclado.nextDouble();

        // edad inferior a 40 y sueldo < 40000 y experiencia true

        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es "+resultadoEvaluacion);

        lectorTeclado.close();
    }


}

