package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kmh;
		System.out.println("Dime una velocidad (km/h):");
		kmh = sc.nextInt();
		int ms = kmh*5/18;
		System.out.println("En m/s son: "+ms+"m/s");
	}

}
