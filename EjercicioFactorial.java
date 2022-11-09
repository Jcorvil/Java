public class EjercicioFactorial {
    public static void main(String[] args){
        int num = 4;
        int resultado = 1;
        System.out.println("Calcular factorial del numero: " + num);

        for(int i= num; i>=1; i--){
            resultado = i *(resultado);
        }
        System.out.println("Factorial: " + resultado);
    }
}