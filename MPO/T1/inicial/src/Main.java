public class Main {

    int edadGlobal = 12;

    public static void main(String[] args) {
        System.out.println("Esta es la primera línea del programa");
        System.out.println("Este es mi primer programa en Java");

        String miNombre; // null. Si se crea y no le asignas valor es null
        miNombre = "Belén";
        System.out.println("Mi nombre es: " +miNombre);

        miNombre = "Belén J.S";
        System.out.println("Mi nombre es: " +miNombre);

        char letraDNI = 'K';
        System.out.println("Mi letra es: " +letraDNI);

        char letraNumero = 123;
        System.out.println("Mi letraNúmero es: " +letraNumero);


        int edad = 41;
        double altura = 1.71787999;
        float peso = 70.76f;

        System.out.println("Mi altura es: " +altura);
        System.out.println("Mi peso es: " +peso);

        boolean experiencia = true;

        System.out.println("Mi experiencia es: " +experiencia);
    }

    public void nombreMetodo() {
        int edadMetodo = 12;
        System.out.println(edadGlobal);
    }
}
