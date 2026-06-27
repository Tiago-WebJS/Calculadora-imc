public class CalculadoraRecursiva {

    public static double potencia(double base, int expoente) {
        if (expoente == 0) {
            return 1; 
        }
        return base * potencia(base, expoente - 1); 
    }

    public static double calcularIMCRecursivo(double peso, double altura) {
        double alturaAoQuadrado = potencia(altura, 2);
        return peso / alturaAoQuadrado;
    }
}