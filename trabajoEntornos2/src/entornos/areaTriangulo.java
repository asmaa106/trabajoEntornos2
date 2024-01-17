package entornos;
 
import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado del triángulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("Ingrese el segundo lado del triángulo: ");
        int lado2 = scanner.nextInt();

        double areaTriangulo = calcularArea(lado1, lado2);
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }

    public static double calcularArea(int lado1, int lado2) {
        return 0.5 * lado1 * lado2;
    }
}
