public class EjercicioFactorial {
    //Calcular el factorial de un número, en este caso 4 (4*3*2*1=24)
    public static void main(String[] args){
        int num = 4;
        int factorial = 1;
        System.out.println("Calcular factorial del numero: " + num);

        for(int i= num; i>=1; i--){
            factorial = i *(factorial);
        }
        System.out.println("Factorial: " + factorial);
    }
}