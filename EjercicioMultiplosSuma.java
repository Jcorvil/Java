public class EjercicioMultiplosSuma {
    // Dado un número n, escribir la suma de todos los mútiplos de 3 y 5 hasta n
    public static void main(String[] args) {
        int N = 10;
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los " + N + " primero mútiplos de 3 y 5 es: " + suma);
    }
}