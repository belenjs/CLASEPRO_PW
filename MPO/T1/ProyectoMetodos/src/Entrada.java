import model.Operaciones;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejecución de Métodos");
        saludar("Borja");
        despedir();
        // model.Operaciones.sumar(4,8);
        // model.Operaciones.restar(6,3);

        Operaciones operacionesMatematicas = new Operaciones(); // CREAR UN OBJETO TIPO OPERACIONES
        operacionesMatematicas.sumar(3,6);
        operacionesMatematicas.sumar(9,4);
        operacionesMatematicas.restar(10,5);
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }

    public static void despedir(){
        System.out.println("Adiós");
        System.out.println("Por hoy ya hemos terminado");
    }
}
