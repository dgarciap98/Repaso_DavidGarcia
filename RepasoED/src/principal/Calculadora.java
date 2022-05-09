package principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		// Introducir una nueva opcion para calcular el IVA
		// El primer numero seria el precio y el segundo el IVA
		// El usuario introduce el IVA que desea

		Scanner entrada = new Scanner(System.in);
		
		String eleccion = "";
		char opcion = ' ';
		int num1=0, num2=0;
		boolean parar = false;
		
		do {
			System.out.println("Introduce la operacion que deseas"
					+ "\n 1) Sumar"
					+ "\n 2) Restar"
					+ "\n 3) Multiplicar"
					+ "\n 4) Dividir"
					+ "\n 5) Calcular IVA"
					+ "\n 6) Salir");
					
			opcion = entrada.nextLine().toUpperCase().charAt(0);
			
			if(opcion!='5') {
				System.out.println("Introduce el primero numero");
				num1 = Integer.parseInt(entrada.nextLine());
				
				System.out.println("Introduce el segundo numero");
				num2 = Integer.parseInt(entrada.nextLine());
			}
			
			switch(opcion) {
				case '1':
					System.out.println("Resultado: " + (num1+num2));
					break;
				case '2':
					System.out.println("Resultado: " + (num1-num2));
					break;
				case '3':
					System.out.println("Resultado: " + (num1*num2));
					break;
				case '4':
					System.out.println("Resultado: " + (num1/num2));
					break;
				case '5':
					System.out.println(num1+1.21);
					parar = true;
					break;
				case '6':
					System.out.println("Fin de programa");
					parar = true;
					break;
				default: 
					System.out.println("Opcion invalida");
					break;
			}
			
		}while(!parar);	
	
	}

}
