//Cambios realizados por Jose Rafael para el ejercicio 2.
package metodoMain;

public class TestArgumentosMain {

	public static void main(String[] args) {
		
		System.out.println("El numero de argumentos pasados son: " + args.length);
		System.out.print("Mostrando los argumentos pasados al reves y en mayuscula: ");
		for(int i=args.length-1; i>-1; i--) {
			System.out.print(args[i].toUpperCase());
			System.out.print(" ");
		}

	}

}
