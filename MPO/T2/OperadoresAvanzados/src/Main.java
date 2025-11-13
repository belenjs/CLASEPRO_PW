// import nombrePaquete.NombreClase
// import controller.GestorDocumentos // porque quiero acceder a la clase desde aquí, y está en una carpeta diferente
// import controller.GestorUsuarios
// import controller.*  // imoporta todas las clases que tengo en la carpera controller

import controller.GestorDocumentos;
import controller.GestorUsuarios;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando la clase");

        GestorUsuarios gestorUsuarios = new GestorUsuarios(); // acabo de construir un objeto de tipo GestorUsuarios (variable compleja) = instanciar un objeto
        gestorUsuarios.validarUsuario("Belén", 34, "belen@gmail.com");

        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        gestorDocumentos.imprimirFactura(12);

        GestorDocumentos.ejecutarDocumento();

    }
}
