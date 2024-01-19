package entornos;
import java.util.Scanner;
public class areaCubo_AC {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la longitud de un lado del cubo: ");
	        double longitudLado = scanner.nextDouble();

	        double area = calcularAreaCubo(longitudLado);

	        System.out.println("El área del cubo con longitud de lado " + longitudLado + " es: " + area);

	        scanner.close();
	    }

	    public static double calcularAreaCubo(double lado) {
	        return 6 * lado * lado;
	    }
	}


