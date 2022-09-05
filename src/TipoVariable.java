
public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		int edad = 25;
		System.out.println(edad);
		
		edad = 25 + 125;
		System.out.println(edad);

		//edad = 30.45 no se puede por que necesito que sea Double
		
		double salario = 2450.50;
		System.out.println(salario);
		
		double salarioMitad = salario/2;
		System.out.println(salarioMitad);
		//no puedo usar las variables antes de declararlas 
		//diferente a JS
		
		double peso = 4.0;
		int cantidad = 10;
		System.out.println(peso*cantidad);
		
		//Vamos a hacer conversiones
		//Este ejemplo es un cast
		double variable1 = 230.58;
		int variable1Entero = (int) variable1;
		System.out.println(variable1Entero);
		//omite el .58
	}

}
