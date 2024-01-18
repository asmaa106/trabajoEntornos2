package entornos;
public class calcCilindro {

    public static double calcularAreaCilindro(double radio, double altura) {
        return 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
    }

    public static void main(String[] args) {
        double radioCilindro = 5;
        double alturaCilindro = 10;

        double areaResultante = calcularAreaCilindro(radioCilindro, alturaCilindro);

        System.out.println("El área del cilindro con radio " + radioCilindro +
                " y altura " + alturaCilindro + " es: " + areaResultante);
    }
}
