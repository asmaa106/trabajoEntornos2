package entornos;

public class calcCubo {
    public static double calcularVolumen(double lado) {
        return Math.pow(lado, 3);
    }

    public static void main(String[] args) {
        double ladoCubo = 5.0;
        double volumenCalculado = calcCubo.calcularVolumen(ladoCubo);
        System.out.println("El volumen de un cubo con lado " + ladoCubo + " es: " + volumenCalculado);
    }
}

