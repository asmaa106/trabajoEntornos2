package entornos;
import java.util.Scanner;
public class areaCubo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud de un lado del cubo
        System.out.print("Ingrese la longitud de un lado del cubo: ");
        
        // Leer la longitud del lado del usuario
        double lado = scanner.nextDouble();

        // Calcular el área del cubo
        double area = calcularAreaCubo(lado);

        // Mostrar el resultado
        System.out.println("El área del cubo con lado " + lado + " es: " + area);

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para calcular el área del cubo
    public static double calcularAreaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }
}
