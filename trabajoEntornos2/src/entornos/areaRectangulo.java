package trabajoEntornos2;
import java.util.Scanner;
public class areaRectangulo {


    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud del rectángulo
        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        // Solicitar al usuario que ingrese el ancho del rectángulo
        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        // Cerrar el objeto Scanner después de su uso
        scanner.close();

        // Calcular el área del rectángulo
        double area = calcularAreaRectangulo(longitud, ancho);

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);
    }

    // Método para calcular el área del rectángulo
    public static double calcularAreaRectangulo(double longitud, double ancho) {
        return longitud * ancho;
    }
}
