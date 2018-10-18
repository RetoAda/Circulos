package es.unex.cum.retoada;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Main M = new Main();
		int n; //Sera el numero de circulos que se van a comprobar
		String [] c; 
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = new String[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.next(); //Introducimos los datos en un array de n posiciones-
		}
		for (int i = 0; i < c.length; i++) {
			M.comprobarCentros(c[i]);
		}
		sc.close();
	}
	public void comprobarCentros(String c) {
		StringTokenizer tokens = new StringTokenizer(c, ",");
		/*
		 * Se crean dos arrays. Uno para cada circulo. 
		 * Las dos primeras posiciones seran las coordenadas del centro
		 * La tercera posicion sera el radio
		 * 
		 */
		int [] circulo1 = new int[3];
		int [] circulo2 = new int[3];
		for (int i = 0; i < circulo1.length; i++) {
			circulo1[i] = Integer.parseInt(tokens.nextToken());
		}
		for (int i = 0; i< circulo2.length; i++) {
			circulo2[i] = Integer.parseInt(tokens.nextToken());
		}
		if(circulo1[0] == circulo2[0] && circulo1[1] == circulo2[1]) {
			System.out.println("Interiores, Concentricas.");
		}
		else {
			double distancia = (double)Math.hypot((circulo1[0]-circulo2[0]), circulo1[1]-circulo2[1]);
			if (distancia < circulo1[2] || distancia < circulo2[2]) {
				System.out.println("Interiores.");
			}
			else {
				System.out.println("Exteriores.");
			}
		}
	}
}
