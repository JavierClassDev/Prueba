package Arrays1;
import java.util.Scanner;

public class ArraysMain {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		
		//Ejercicio 1
		/*
		int [] puntos = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		for (int posicion = 0; posicion < puntos.length; posicion++){
				System.out.println("El valor en la posición " + posicion + " del array es " + puntos[posicion]);
			}
		*/
		
		
		//Ejercicio 2
		/*
		String [] nombres = new String[10];
		for (int posicion = 0; posicion < nombres.length; posicion++){
				System.out.print("Introduzca el nombre: ");
				nombres[posicion]=p.next();
			}
		for (int posicion = 0; posicion < nombres.length; posicion++){
			System.out.println("El nombre en la posición " + posicion + " del array es " + nombres[posicion]);
		}
		*/
		
		
		//Ejercicio 3
		/*
		float media = 0;
		float [] num = new float[10];
		for (int posicion = 0; posicion < num.length; posicion++){
				System.out.print("Introduzca el número: ");
				num[posicion]=p.nextFloat();
			}
		for (int posicion = 0; posicion < num.length; posicion++){
			media=media+num[posicion];
		}
		System.out.println("La media es: " + media/10);
		*/
		
		
		//Ejercicio 4
		
		double [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Introduzca el porcentaje de incremento: ");
		double i=p.nextDouble();
		i=i/100;
		for (int posicion = 0; posicion < num.length; posicion++){
			System.out.println(num[posicion]+(num[posicion]*i));
		}
		
		
		p.close();

		//Ejercicio 5
		System.out.println("Extra");
	}

}
