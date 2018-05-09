package Ordenamiento;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * 1.- Crear un array de 30 posiciones cargado con números generados
 * aleatoriamente entre 1 y 100. Se pide: a) Introducir un nº comprendido entre
 * 1 y 100 y buscarlo en el array con búsqueda secuencial. El proceso debe
 * indicar si se encuentra el elemento o no y, en caso afirmativo, en qué
 * posición. b) Ordenar el array crecientemente. c) Repetir el apartado a). La
 * búsqueda secuencial se debe optimizar para deducir que el número no está en
 * el array ordenado si se encuentra uno mayor que el buscado. d) Repetir el
 * apartado a) utilizando búsqueda binaria o dicotómica.
 * 
 * @author David Palanco
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[5];
		boolean encontrado = false;
		int posicion = 0;

		// carga array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
		}
		// mostrar array
		System.out.println("Array sin ordenacion creciente");
		mostrarArray(array);
		System.out.println(" ");
		System.out.println(" ");



			
			
		
		System.out.println("Introduce un elemento a buscar");
		int elemento = in.nextInt();
        
		System.out.println("busqueda Secuencial");
		for (int i = 0; i < array.length && !encontrado; i++) {
			if (array[i] == elemento) {
				System.out.println("Elemento encontrado");
				posicion = i + 1;
				encontrado = true;
			}

		}
		if (encontrado)

			System.out.println("El elemento esta en la posicion " + posicion);
		else
			System.out.println("No encontrado");
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		//Ordenar el array
		int aux;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		System.out.println("Array ordenado crecientemente");
		mostrarArray(array);
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		System.out.println("Con el array ordenado optimizamos para dejar de buscar si se encuentra uno mayor ");
		System.out.println(" ");
		System.out.println("Busqueda binaria o dicotomica");
		encontrado=false;
		posicion=0;
		int medio,superior,inferior;
		//iniciamos los limites
		inferior=0;
		superior=array.length-1;
		
		do {
			medio=(inferior+superior)/2;
			if (array[medio]==elemento) {
				encontrado=true;
				posicion=medio+1;
			}else {
				if (array[medio]>elemento) {
					superior=medio-1;
					
				}else {
					inferior=medio+1;
				}
			}
		} while (!encontrado && inferior<=superior);
		
		if (encontrado)
			System.out.println("El elemento esta en la posicion " + posicion);
		else
			System.out.println("No encontrado");
		
	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	

}
