public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejecución de Métodos");
        saludar("Borja");
        // Operaciones.sumar(4,8);
        // Operaciones.restar(6,3);

        Operaciones operacionesMatematicas = new Operaciones(); // CREAR UN OBJETO TIPO OPERACIONES
        operacionesMatematicas.sumar(3,6);
        operacionesMatematicas.sumar(9,4);
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }

    /*public static void despedir(String nombre){
        System.out.println("Adiós "+nombre);
    }*/
}
