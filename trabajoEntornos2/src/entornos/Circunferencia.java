package entornos; 
import java.util.Scanner;

public class Circunferencia {
    // Método estático para calcular el área de una circunferencia
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método estático para calcular el perímetro de una circunferencia
    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double radioCircunferencia = 5.0;

        double area = Circunferencia.calcularArea(radioCircunferencia);
        double perimetro = Circunferencia.calcularPerimetro(radioCircunferencia);

        System.out.println("Radio: " + radioCircunferencia);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
