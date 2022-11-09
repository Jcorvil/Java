public class declararxey {
    public static void main(String[] args) {
        // Declarar x e y
        int x = 5;
        int y = 8;
        // Crear bloque donde se imprima x
        {
            System.out.println(x);
            // variable z
            int z = 4;
            // bloque dentro
            {
                // imprimir // imprimir y
                // imprimir z
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }

        // Crear bloque donde se imprima y
        {
            System.out.println(y);
        }
    }
}