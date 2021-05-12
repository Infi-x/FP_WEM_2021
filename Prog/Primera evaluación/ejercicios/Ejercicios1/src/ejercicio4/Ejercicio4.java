package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("Dime una cantidad de grados centigrados: ");
		c = sc.nextInt();
		int faren = 32+(9*c/5);
		System.out.println("En grados farenheit es: "+faren);
	}

}
