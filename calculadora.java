public class calculadora {
    final static int max = Integer.MAX_VALUE;
    public static void main(String[] args){
        Integer a = 2;
        Integer b = 3;
        Integer c = 4;
        //Suma de "a" mas "b" multiplicado por "c"
        Integer resultado1 = ((a + b) * c);
        System.out.println("El resultado es: " + resultado1);
        //"a" a la potencia de "b"
        Double potencia = Math.pow(a,b);
        System.out.println("El resultado es: " + potencia);
        //Máximo de los numeros enteros
        Math.max (a, max);
        Double resultado2 = Math.max((double)a, max);
        System.out.println(resultado2);       
    }
}