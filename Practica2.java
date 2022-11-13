public class Practica2 {
    /*
     * Dado un número entero aleatorio entre 1 y 100 que será almacenado en la
     * variable randomNumber, mostrar por pantalla si este número es primo o no.divisores
     * Un número es primo cuando es divisible entre 1 y entre sí mismo, es decir,
     * que solo tiene dos divisores.
    */

    // Se almacenan los números aleatorios en constantes, el mínimo y el máximo, ya que son números que no van a cambiar.
    
    final static int min = 1;
    final static int max = 100;

    
    /** 
     * @param args
     * @author Jorge Coronil Villalba
     */
    public static void main(String[] args) {


        /**
         * @param randomNumber Genera un numero aleatorio
         * @param divisor Determina el numero entre el que se divide numDivisores
         * @param numDivisores Almacena la cantidad de divisores entre los que randomNumber tiene 0 como resto
         * @return Devuelve si el numero es primo o no
         */

        //Operación que devuelve un número aleatorio, en este caso entre 1 y 100.
        int randomNumber = (int) (Math.random() * max + min);

        /*En esta variable se almacena la cantidad de divisores que tiene el número aleatorio obtenido anteriormente.
         *Este numero se obtendrá mediante la operación que se encuentra en el "for".
        */
        int numDivisores = 0;

        /*En esta operación se calcula la cantidad de divisores que tiene el numero aleatorio.
         *Se determina que "divisor" tiene como valor 1, y en cada iteración va a incrementar su valor en 1 hasta que iguale al numero aleatorio.
         *Por ejemplo, si el número aleatorio es 15, se realizarán 15 iteraciones, valiendo "divisor" 1 en la primera, 2 en la siguiente, luego 3, 
         *y asi hasta llegar a 15. Cuando ambos números se igualen, se terminará el bucle.
        */
        for (int divisor = 1; divisor <= randomNumber; divisor++) {
            /*Dentro del "if" se calcula si la división del numero aleatorio entre el divisor calculado en el "for" tiene de resto 0.
             *En caso de que lo tenga se incrementa la variable en 1.
            */
            if (randomNumber % divisor == 0) {
                numDivisores++;
            }

            /*El siguiente "if" sirve para optimizar el código. Como un número primo solo tiene dos divisores, el siguiente "if" determina que
             *si el numero de divisores es igual o mayor a 3, salga del bucle, ya que no hace falta calcular mas divisores, se sabe que no es primo.
            */
            if (numDivisores >= 3){
                break;
            }
        }

        /*Una vez "divisor" iguale al numero aleatorio, o si "numDivisores" es mayor o igual a 3, saldrá del bucle y entrará en el siguiente "if".
         *En este paso es donde se determina si el numero es primo o no usando la información obtenida en el bucle anterior.
         *Un número es primo cuando es divisible SOLO entre 1 y si mismo, es decir, cuando tiene solo dos divisores.
         *De esta forma, determinados que si "numDivisores" es igual a dos, se imprima por pantalla que el numero es primo. De lo contrario, se imprime que no lo es.
        */
        if (numDivisores == 2) {
            System.out.println(randomNumber + " es primo");
        } else {
            System.out.println(randomNumber + " no es primo");
        }
    }
}