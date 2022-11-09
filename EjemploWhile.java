public class EjemploWhile {
    /*"int i = 1" dice que la i vale uno.
    "while(i <= 5)" imprime 1 de forma infinita, ya que la i siempre vale 1, pero con "i++" decimos
    que tras cada instancia la i se incrementa en 1
    */
    public static void main(String[] args){
        int i = 1;
        while(i <= 5){
            System.out.println("i: " + i);
            i++;
        }

    //Igual, pero al revés. Con "a--" decimos que haga un decremento
        int a = 5;
        while(a >= 0){
            System.out.println("a: " + a);
            a--;
        } 
    }
}