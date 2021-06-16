package fp.daw.exprog20210616.ejercicio4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {
		Queue<Integer> cola = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(cola);
		intercalar(cola);
		System.out.println(cola);

	}

	public static void intercalar(Queue<Integer> cola) {

		// creo otra cola a la que le voy a añadir los elementos desde la mitad al final
		// de la cola
		Queue<Integer> colaSacados = new LinkedList<Integer>();
		if (!((cola.size() % 2) == 0))
			throw new IllegalArgumentException("La cola no contiene un numero par de elementos");

		// recorro la cola original desde el caracter mitad hacia el final y almaceno
		// los numeros en una nueva cola
		if (!cola.isEmpty()) {
			for (int i = (cola.size() / 2); i < cola.size(); i++) {
				int numSacado = cola.poll();
				((LinkedList<Integer>) colaSacados).offer(numSacado);
			}
		}
		/*
		 * la idea es extraer primero el primer elemento de la cola, y el primero de
		 * colasacados, los almaceno y los añado de nuevo al final de la cola, primero
		 * primerncola y despues primerncolasacados y asi cuando de la vuelta entera se
		 * los numeros deberian aparecer intercalados.
		 */

		for (int e = 0; e < cola.size(); e++) {
			int primerNcola = 0;
			int primerNcolaSacados;
			while (!cola.isEmpty()) {
				while (!colaSacados.isEmpty()) {
					primerNcola = cola.poll();
					primerNcolaSacados = colaSacados.poll();
					cola.offer(primerNcola);
					cola.offer(primerNcolaSacados);

				}

			}

		}

	}

}
