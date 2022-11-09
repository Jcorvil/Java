public class Ejerciciomultiplo5 {
    //Imprimir por pantalla los multiplos de 5 entre 5-25 usando "continue". /5/10/15/20/25/
    public static void main(String[] args){
        for(int num1 = 5; num1 <= 25; num1++){
            if(num1 % 5 != 0)
                continue; 
            
            System.out.println("Es un múltiplo de 5: " + num1);
        }
    }
}