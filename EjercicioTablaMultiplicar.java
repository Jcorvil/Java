public class EjercicioTablaMultiplicar {
    // Mostrar la tabla de multiplicar de los números del 1 al 10
    public static void main(String[] args) {
        //Todo en una columna
        final int N = 10;
        int num = 1;
        while (num != N + 1) {
            System.out.println("Tabla del " + num);
            for (int i = 1; i <= N; i++)
                System.out.println("|" + num + " por " + i + " = " + (num * i) + "|");
            num = num + 1;
        }
    }
}