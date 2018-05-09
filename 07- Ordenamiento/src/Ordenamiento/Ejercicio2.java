package Ordenamiento;


public class Ejercicio2 {
	
	public static void main(String[] args) {
		String[] departamentos = {"Informatica","Contabilidad","RecursosHumanos","Administracion","Gestion","Ventas","Compras","I+D"};
		int[] presupuestos = {8000,5000,4000,12000,7500,11000,1000,2500};
		System.out.println("Sin ordenar");
		mostrarArray(departamentos);
		System.out.println();
		mostrarArray(presupuestos);
		//Ordenamos el array
		String aux;
		int auxInt;
		for (int i = 0; i < departamentos.length-1; i++) {
			for (int j = i+1; j < departamentos.length; j++) {
				if (departamentos[i].compareToIgnoreCase(departamentos[j])>0) {
					aux=departamentos[i];
					departamentos[i]=departamentos[j];
					departamentos[j]=aux;
					
					auxInt=presupuestos[i];
					presupuestos[i]=presupuestos[j];
					presupuestos[j]=auxInt;
				}
			}
		}

System.out.println(" ");
System.out.println("Ordenado alfabeticamente");
		mostrarArray(departamentos);
		System.out.println();
		mostrarArray(presupuestos);
	}

	private static void mostrarArray(String[] departamentos) {
		for (int i = 0; i < departamentos.length; i++) {
			System.out.print(departamentos[i]+"             ");
			
		}
		
	}
	
	private static void mostrarArray(int[] presupuestos) {
		for (int i = 0; i < presupuestos.length; i++) {
			
			System.out.print(presupuestos[i]+"                   ");
		}
		
	}

	

}





/**
 * Crear dos arrays de tamaño 8 llamados departamentos y presupuestos que contengan respectivamente los nombres (desordenados) de 10 departamentos y los presupuestos correspondientes:

Informatica	Contabilidad	Recursos Humanos	Administracion	…			


80000
	50000	40000	12000	…			

Se pide:

•	Ordenar el array de nombres alfabéticamente (y en el mismo orden el de presupuestos para mantener la correspondencia)
•	Hacer una búsqueda binaria del nombre de un departamento introducido por teclado obteniendo su correspondiente presupuesto o indicar que no se encuentra.
•	Obtener el nombre del departamento de mayor presupuesto.


Nota: 
•	Para decidir si dos String son iguales podéis usar el método nombre1.equals(nombre2) o nombre1.equalsIgnoseCase(nombre2)
•	Para comparar si un String es mayor que otro podéis usar el método compareTo nombre1.compareTo(nombre2) que devuelve un valor:
o	Igual a 0 si ambos nombres son iguales
o	Menor que 0 si nombre1 es menor que nombre2
o	Mayor que 0 si nombre1 es mayor que nombre2

 *
 */