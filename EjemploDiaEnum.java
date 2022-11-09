public class EjemploDiaEnum {
    public static void main(String[]args){
        enum Dia{
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO,
        }

        Dia DiadeHoy = Dia.MIERCOLES;

        switch (DiadeHoy) {
            case LUNES: System.out.println("Hoy es Lunes");
            break;
            case MARTES: System.out.println("Hoy es Martes");
            break;
            case MIERCOLES: System.out.println("Hoy es Miércoles");
            break;
            case JUEVES: System.out.println("Hoy es Jueves");
            break;
            case VIERNES: System.out.println("Hoy es Viernes");
            break;
            case SABADO: case DOMINGO: System.out.println("Fin de semana");
            break;
        }
    }     
}