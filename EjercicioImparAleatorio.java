public class EjercicioImparAleatorio {
    public static void main(String[] args){
        final int MAX = 10;
        final int numSalir = 3;
        int numAleatorio = (int) (Math.random()*MAX);

        while(numSalir != numAleatorio){
            numAleatorio = (int) (Math.random()*MAX);
            System.out.println(numAleatorio);
        }
    }
}