/**
 *Esto es una clase de ejemplo
 */
public class EjemploString {
    public static void main(String[] args) {
    //Crear una variable String
    String nombre = "Jorge";
    String apellido = "Coronil";
    int edad = 25;
    //Imprimir el valor de la variable
    System.out.println("Hola " + nombre);

    //Imprimir con formato
    System.out.printf("Hola %s %s, tengo %d años \t \" Siguiente línea", nombre, apellido, edad);
    //Los "%s" dicen que ahí va un string, y al final se ponen el orden en el que deben salir
    }
}