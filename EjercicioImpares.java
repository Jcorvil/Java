public class EjercicioImpares {
    // Mostrar los numeros impares del 1 al 10
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++){
            
            if (i % 2 != 0) {
                System.out.println("i: " + i);
            }
        }
    }
}