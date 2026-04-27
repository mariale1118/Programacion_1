import java.util.Random;
import java.util.Scanner;

public class PI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de iteraciones : ");
        int n = scanner.nextInt();

        // metodo montecarlo
        Random random = new Random();
        double radio = lado / 2;
        int puntosDentro = 0;

        for (int i = 0; i < n; i++) {
            double x = (random.nextDouble() * lado) - radio;
            double y = (random.nextDouble() * lado) - radio;

            if (x * x + y * y <= radio * radio) {
                puntosDentro++;
            }
        }

        double piMontecarlo = 4.0 * puntosDentro / n;

        // serie de leibniz
        double suma = 0;

        for (int i = 0; i < n; i++) {
            double denominador = 2 * i + 1;
            if (i % 2 == 0) {
                suma = suma + (1.0 / denominador);
            } else {
                suma = suma - (1.0 / denominador);
            }
        }

        double piLeibniz = 4 * suma;

        // imprimir resultados
        System.out.println("Montecarlo: " + piMontecarlo);
        System.out.println("Diferencia montecarlo: " + Math.abs(Math.PI - piMontecarlo));

        System.out.println("Leibniz: " + piLeibniz);
        System.out.println("Diferencia leibniz: " + Math.abs(Math.PI - piLeibniz));

        scanner.close();
    }
}