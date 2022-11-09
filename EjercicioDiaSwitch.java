public class EjercicioDiaSwitch {
    //El "default" sirve para cualquier caso que no esté definido, como por ejemplo 8, 9 o -1
    public static void main(String[] args){
        int dia = 5;
        switch (dia) {
            case 1: System.out.println("Hoy es Lunes");
            break;
            case 2: System.out.println("Hoy es Martes");
            break;
            case 3: System.out.println("Hoy es Miércoles");
            break;
            case 4: System.out.println("Hoy es Jueves");
            break;
            case 5: System.out.println("Hoy es Viernes");
            break;
            case 6: System.out.println("Hoy es Sábado");
            break;
            case 7: System.out.println("Hoy es Domingo");
            break;
            default: System.out.println("Introduzca solo números del 1 al 7");
        }
    }
}