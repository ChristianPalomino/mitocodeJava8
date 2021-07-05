package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosPropuestos {

	public void pregunta1() {
		Scanner entrada = new Scanner(System.in);
		int num;
		String msj;
		System.out.println("Ingresa un numero");
		num = entrada.nextInt();
		msj = num >= 0 ? "El numero es positivo" : "El numero es negativo";
		System.out.println(msj);
		entrada.close();
	}

	public void pregunta2() {
		Scanner entrada = new Scanner(System.in);
		int num;
		String msj;
		System.out.println("Ingresa un numero");
		num = entrada.nextInt();
		msj = num % 2 == 0 ? "El numero es par" : "El numero es impar";
		System.out.println(msj);
		entrada.close();
	}

	public void pregunta3() {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Ingresa primer numero");
		num1 = entrada.nextInt();
		System.out.println("Ingresa segundo numero");
		num2 = entrada.nextInt();
		System.out.println("Ingresa tercer numero");
		num3 = entrada.nextInt();
		if (num1 > num2) {
			if (num1 > num3)
				System.out.println("El mayor de los tres numeros es: " + num1);
			else
				System.out.println("El mayor de los tres numeros es: " + num3);
		} else {
			if (num2 > num3)
				System.out.println("El mayor de los tres numeros es: " + num2);
			else
				System.out.println("El mayor de los tres numeros es: " + num3);
		}
		entrada.close();
	}

	public void pregunta4() {
		Scanner entrada = new Scanner(System.in);
		String frase, fraseReverse;
		System.out.println("Introduce una frase");
		frase = entrada.next();
		StringBuilder sb = new StringBuilder(frase);
		fraseReverse = sb.reverse().toString();
		String msj = frase.equalsIgnoreCase(fraseReverse) ? "Es palindromo" : "No es palindromo";
		System.out.println(msj);
		entrada.close();
	}

	public void pregunta5() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese cadena de texto");
		String texto = entrada.nextLine();
		Random generador = new Random();
		int numero = generador.nextInt(9);
		texto = texto.replaceAll("\\s", "");
		texto = texto.replace(String.valueOf(texto.charAt(0)), String.valueOf(numero));
		System.out.println(texto);
		entrada.close();

	}

	public static void main(String[] args) {
		EjerciciosPropuestos p = new EjerciciosPropuestos();
		p.pregunta5();

	}

}
