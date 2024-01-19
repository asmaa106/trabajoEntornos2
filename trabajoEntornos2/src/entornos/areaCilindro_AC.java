package entornos;
import java.util.Scanner;
public class areaCilindro_AC {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el radio del cilindro: ");
	        double radio = scanner.nextDouble();

	        System.out.print("Ingrese la altura del cilindro: ");
	        double altura = scanner.nextDouble();

	        double area = calcularAreaCilindro(radio, altura);

	        System.out.println("El área del cilindro es: " + area);
	    }

	    public static double calcularAreaCilindro(double radio, double altura) {
	        return 2 * Math.PI * radio * (radio + altura);
	    }
	}


