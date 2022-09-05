
public class PracticandoCondicionales {

	public static void main(String[] args) {

		int edad = 8;
		int cantidad = 2;
		if (edad >= 18) {
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero esta permitido entrar");
			} else {

			}
			System.out.println("Usted no puede entrar");
		}
		// ejemplo
		double salario = 3300.0;
		if (salario < 2600.0) {
			System.out.println("Su tasa es del 15%");
			System.out.println("Puede deducir R $ 350");
		}

		if (salario < 3750.0) {
			System.out.println("Su tasa es del 22.5%");
			System.out.println("Puede deducir R $ 636");
		}
		
		//Booleanos
		//Operadores logicos son AND && y OR ||
		int edad5 = 68;
		boolean esAnciano = edad5>=65;
		//true
		
		//Scope
		//todo lo que viene de Llaves
	}

}
