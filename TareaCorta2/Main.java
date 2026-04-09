import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convertir convertir = new Convertir();
        
        int opcion;
        double valor;
        double resultado;

        System.out.println("Escoja una opción para convertir");
        System.out.println("1) Metros a Kilómetros");
        System.out.println("2) Kilómetros a Millas");
        System.out.println("3) Millas a Kilómetros");
        System.out.println("4) Metros a Yardas");
        System.out.print("Escoja una opción del 1 al 4 ");
        
        opcion = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        valor = scanner.nextDouble();

        
        switch (opcion) {
            case 1:
                resultado = convertir.metrosAKilometros(valor);
                System.out.println(valor + " metros es igual a a " + resultado + " km");
                break;
            case 2:
                resultado = convertir.kilometrosAMillas(valor);
                System.out.println(valor + " km es igual a " + resultado + " millas");
                break;
            case 3:
                resultado = convertir.millasAKilometros(valor);
                System.out.println(valor + " millas es igual a " + resultado + " km");
                break;
            case 4:
                resultado = convertir.metrosAYardas(valor);
                System.out.println(valor + " metros es igual a " + resultado + " yardas");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
        System.out.println("Fin");
    }
}