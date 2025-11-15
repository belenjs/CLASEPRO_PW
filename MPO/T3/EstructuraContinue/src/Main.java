public class Main {

    // break -> rompe una iteración
    // continue -> la iteración que tenga el continue no la ejecuta, pero no rompe la ejecución, pasa de ella.
    // return ->  retorna un valor en el metodo y lo termina. Es la ultima linea del metodo
    // if -> condicional que permite ejecutando un cuerpo u otro (uso  tradicional)
    // if terniario -> decida el valor de una variable sobre una condición lógica
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            System.out.println("Ejecución dentro del for "+i);
        }*/

        int nota = 5;
        // variable ? condición ? el valor de la variable si la dondición es true : el valor de la variable si la condición es false
        String resultado = nota>=5 ? "Examen aprobado" : "Examen suspenso";
        System.out.println(resultado);
    }
}
