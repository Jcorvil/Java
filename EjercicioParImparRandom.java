public class EjercicioParImparRandom {
    //Par / impar con un número dado mediante una variable con valor aleatorio entre 0 y 100.
    public static void main(String[] args){
        int max = 100;
        int numerorandom = (int) (Math.random()*max);
        //Arriba se define el máximo (max) y se define la operación random (numerorandom)
        
        String par = numerorandom + " es par";
        String impar = numerorandom + " es impar";

        if (numerorandom % 2 == 0)
            System.out.println(par);
        else
            System.out.println(impar);
    }
}   