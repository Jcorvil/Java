public class EjemploBreak {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            if(i==3){
                break;
            }
            //break: Dice que, una vez i sea igual a 3, salga del bucle. Imprime 1 y 2
            //continue: Dice que, cuando la i llegue a 3, se lo salte. Imprime 1, 2, 4 y 5
            System.out.println("i: " + i);
        }
    }
}