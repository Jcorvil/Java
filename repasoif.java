public class repasoif {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println(a + " es mayor");
        } else if (a < b) {
            System.out.println(b + " es mayor");
        } else {
            System.out.println(a + " es igual a " + b);
        }

        int mayor;
        int menor;
        //if else en una sola línea
        mayor = (a >= b) ? a : b;
        menor = (a <= b) ? a : b;
        System.out.println("El mayor es " + mayor + ". El menor es " + menor);
    }
}