package proyecto;

import java.util.Random;
import java.util.Scanner;

public class JuegoVida {

	public static void main(String[] args) {
				
		// Creamos los objetos de Scanner y de Random.
		Scanner sn = new Scanner(System.in);
		Random rn = new Random();

		// declaramos el tipo de las variables.
		int modo;
		int cel1 = 0, cel2 = 0, cel3 = 0, cel4 = 0, cel5 = 0, cel6 = 0, cel7 = 0, cel8 = 0, cel9 = 0, cel10 = 0,
				turnos = 10;

		// Mostramos el menu en imput, con explicaciones del juego.
		System.out.println("Bienvenido en Juego de la vida, elige modo del juego: ");
		System.out.println(
				"Escribe 1, Para elegir Modo básico        ( 10 turnos, y las células vivas/muertas debe ser ingresada por ti )");
		System.out.println(
				"Escribe 2, Para elegir Modo aleatorio     ( 10 turnos, y las células vivas/muertas de forma aleatoria )");
		System.out.println(
				"Escribe 3, Para elegir Modo personalizado ( Elija el numero de rondas, y las células vivas/muertas debe ser ingresada por ti )");
		System.out.println(
				"Escribe 4, Para elegir modo avanzado      ( Basico mas las celdas de los extremos se consideren vecinas )");

		// guardamos eleccion del jugador de tipo de juego.
		modo = sn.nextInt();

		// como solo en tercer modo se puede elegir cantidades de rondas creamos su
		// propio if, en cual cambiamos valor predefinido de 10 rondas.
		if (modo == 3) {
			System.out.println("¿Cuantas rondas quieres? ");
			turnos = sn.nextInt();
		}
		// para resumir codigo cree solo un if de menu dando valor de 1 a 4. dentro de
		// cual cree un ternario que si elegimos modo 2 creara 10 numeros aleatorios
		// con valor de 0 a 1, y a no ser que sea modo 2 el valor de celdas los
		// ingresara el usuario.
		if (modo >= 1 && modo <= 4) {
			System.out.println("Pon valor a 10 células (1 para viva y 0 para muerta)");
			cel1 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel2 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel3 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel4 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel5 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel6 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel7 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel8 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel9 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();
			cel10 = (modo == 2) ? rn.nextInt(2) : sn.nextInt();

			// elegi el for por que es unico bucle que dimos por ahora, y lo meto dentro de
			// if para que si seequivoquen del modo no salga tabla con todas celdas con
			// valor predeterminado "0"
			for (int t = 0; t < turnos; t++) {
				System.out.println((t + 1) + ": " + cel1 + " " + cel2 + " " + cel3 + " " + cel4 + " " + cel5 + " "
						+ cel6 + " " + cel7 + " " + cel8 + " " + cel9 + " " + cel10);

				// solo pueden vivir si una vecina esta viva y muerta, asi que si valor de
				// vecinas es misma mueren si no es la misma viven
				int nuevoCel1 = ((cel2 == 0) ? 0 : 1);
				int nuevoCel2 = ((cel1 == cel3) ? 0 : 1);
				int nuevoCel3 = ((cel2 == cel4) ? 0 : 1);
				int nuevoCel4 = ((cel3 == cel5) ? 0 : 1);
				int nuevoCel5 = ((cel4 == cel6) ? 0 : 1);
				int nuevoCel6 = ((cel5 == cel7) ? 0 : 1);
				int nuevoCel7 = ((cel6 == cel8) ? 0 : 1);
				int nuevoCel8 = ((cel7 == cel9) ? 0 : 1);
				int nuevoCel9 = ((cel8 == cel10) ? 0 : 1);
				int nuevoCel10 = (cel9 == 0) ? 0 : 1;
				int nuevoCel1B = ((cel10 == cel2) ? 0 : 1);
				int nuevoCel10B = ((cel9 == cel1) ? 0 : 1);

				// las dos ultimas nuevoCel1B y nuevoCel10B son solo para modo 4, y abajo creo
				// de nuevo un ternario para si elegimos el modo 4 se utilize
				// caracteristica de que las ayacentes son vecinas y si elegimos modo 1,2 y 3 no
				// serian vecinas.
				cel1 = (modo == 4) ? nuevoCel1B : nuevoCel1;
				cel2 = nuevoCel2;
				cel3 = nuevoCel3;
				cel4 = nuevoCel4;
				cel5 = nuevoCel5;
				cel6 = nuevoCel6;
				cel7 = nuevoCel7;
				cel8 = nuevoCel8;
				cel9 = nuevoCel9;
				cel10 = (modo == 4) ? nuevoCel10B : nuevoCel10;
			}
		// informacion de error del usuario en eleccion del juego.
		} else 
			System.out.println("Numero/Letra no corespondiente, fuera de rango 1-4.");

	}
		
}
