public class EjercicioSwitchMes {
    public static void main(String[]args){
        enum Mes{
            ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
        }

        Mes mesAnyo = Mes.ABRIL;

        switch (mesAnyo) {
            case ENERO: case MARZO: case MAYO: case JULIO: case SEPTIEMBRE: case NOVIEMBRE: System.out.println("Tiene 31 días");
            break;
            case FEBRERO: System.out.println("Tiene 28 días");
            break;
            case ABRIL: case JUNIO: case AGOSTO: case OCTUBRE: case DICIEMBRE: System.out.println("Tiene 30 días");
            break;
        }
    }
}