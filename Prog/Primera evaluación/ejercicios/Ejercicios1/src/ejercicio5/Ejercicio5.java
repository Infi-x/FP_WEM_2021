package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.println("Dime el radio del círculo:");
		r = sc.nextInt();
		int l = 2*r;
		int a = r*r;
		System.out.println("La longitud de circunferencia es: "+l+"\nY el área del círculo es: "+a);
	}

}
