public class variable {
	public static void main (String[] args) {
		//Las variables se pueden poner todas seguidas y definirlas abajo
		String name, surname;
        name = "Jorge";
        surname = " Coronil";
        int age = 25;
		/**'long' almacena virtualmente todos los números
		*'float' almacena números fraccionales con hasta 7 decimales
		*'double' igual que float, pero con 15 decimales
		*'boolean' almacena valor 'true' o 'false'
		*'char' almacena un único caracter
		*/
		
		/**long horas = 654751432548765L;
		float nota = 5.6F;
		double resultado = 5487215.222548967D;
		boolean parImpar = true;
		char sexo = 'H';
		*/

		System.out.println("Hola " + name);
        System.out.println("Hola me llamo " + name + surname + " y tengo " + age + " años");

		if (age == 25) {
			System.out.println ("Tengo 25 años");
		}else {
			System.out.println ("Tengo otra edad");
		}
		
	}
}