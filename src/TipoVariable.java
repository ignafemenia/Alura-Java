
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
		
		long prueba =122222222222L;
		//nos avisa que es un numero largo 
		//tipo de datos que soportan numeros gigantes
		
		short numeroPequeno = 13444;
		//soporta numeros pequenos 2-16
		byte numeroMasPequeno = 2;
		//admite numeros de 8bits
		float numeroDecimalPequeno = 2.5F;
		//decimal pequeno
		System.out.println(numeroPequeno);
		
		//Probando
		int edad1= 30;
		System.out.println("La edad de marcos es " + edad1 + "!");
		
		double edad2=30.0;
		System.out.println("La edad de Marcos es " + edad2 + "!" );
	}

}
