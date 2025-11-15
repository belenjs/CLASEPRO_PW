// import nombrePaquete.NombreClase
// import controller.GestorDocumentos // porque quiero acceder a la clase desde aquí, y está en una carpeta diferente
// import controller.GestorUsuarios
// import controller.*  // imoporta todas las clases que tengo en la carpera controller

import controller.GestorDocumentos;
import controller.GestorUsuarios;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Iniciando la clase");

        GestorUsuarios gestorUsuarios = new GestorUsuarios(); // acabo de construir un objeto de tipo GestorUsuarios (variable compleja) = instanciar un objeto
        gestorUsuarios.validarUsuario("Belén", 34, "belen@gmail.com");

        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        gestorDocumentos.imprimirFactura(12);

        GestorDocumentos.ejecutarDocumento();

         */

        /*int numero1 = 5;
        int numero2 = 6;
        int resultado = numero1 & numero2;
        System.out.println("El resultado de la comparación es "+resultado);

        int numero3 = 5;
        int numero4 = 6;
       int  resultado1 = numero3 | numero4;
        System.out.println("El resultado de la comparación es "+resultado1);

        String palabra = null;
        int comparar1 = 0;
        int comparar2 = 20;
        boolean resultadoBool = comparar1<comparar2 | comparar1>=comparar2 | palabra.length()==0;
        System.out.println("El resultado de la comparación booleana es "+resultadoBool);

         */

        // USO DEL .equals

        /*
        String palabra1 = "Borja";
        String palabra2 = "borja";
        // boolean resultadoPalabras = palabra1 == palabra2; // esto NO SE HACE ASÍ
        boolean resultadoPalabrasCorrecta = palabra1.equalsIgnoreCase(palabra2); // aquí no lo compara a nivel de byte
        System.out.println("El resultado de la comparación de las dos palabras es "+resultadoPalabrasCorrecta);

         */

        // CASTEO IMPLÍCITO


        // Recolector de basura -> recopilar todas las variables o elementos del código que no se utilizan y tengan un valor de null
        String nombre = "Borja";
        System.out.println(nombre);
        boolean esCorreo = nombre.contains("@");
        System.out.println("El nombre es: "+nombre);
        System.out.println("Es correo: "+esCorreo);
        nombre = null; // candidata a ser capturada poor el garbage colector
        System.gc(); // fuerza la recolección de elementos en null

    }
}
