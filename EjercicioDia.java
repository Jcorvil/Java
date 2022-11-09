import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

/*No hacen falta poner las llaves en cada "if" porque solo tiene una sentencia.
*Con varias sentencias si harían falta
*/
public class EjercicioDia {
    public static void main(String[] args) {
        int dia = 6;
        if (dia == 1)
            System.out.println("Lunes");
        else if (dia == 2)
            System.out.println("Martes");
        else if (dia == 3)
            System.out.println("Miércoles");
        else if (dia == 4)
            System.out.println("Jueves");
        else if (dia == 5)
            System.out.println("Viernes");
        else if (dia == 6 || dia == 7)
            System.out.println("Finde");
        else
            System.out.println("Solo se pueden introducir valores del 1 al 7");
            
        if (dia == 1)
            System.out.println("Empieza la semana");
        else if (dia == 2 || dia == 3 || dia == 4)
            System.out.println("Mediados de semana");
        else if (dia == 5)
            System.out.println("Feliz viernes");
        else if (dia == 6 || dia == 7)
            System.out.println("Buen finde");
    }
}