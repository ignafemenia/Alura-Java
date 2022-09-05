
public class TrabajandoConCaracteres {

	public static void main(String[] args) {

		char caracter ='a';
		System.out.println(caracter);
		
		caracter = 65; //Representa A en la tabla
		System.out.println(caracter);
		
		//char segundoCaracter = caracter + 1;
		//no compila por que 1 es entero y caracter char
		char segundoCaracter =(char) (caracter+1);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		int numero1= 5;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2= numero1; //5
		System.out.println(numero2);

		numero1 = 88; //5
		System.out.println(numero2);
		
		String saludo = "Hola, mi nombre es ";
		String nombre = "Rómulo ";
		String continuacion = "y mi edad es ";
		int edad = 100;
		System.out.println (saludo + nombre + continuacion + edad);
	}

}
