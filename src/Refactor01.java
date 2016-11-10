/**
 * Ejemplo de código Java Repetido
 * 
 * @author      Paco Gomez <fjgomez@florida-uni.es>
 * @version     1.0 
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Refactor01 {

	public static void main(String[] args) {
		float area;
		//Calculador de areas
		//Cuadrado
		int lado=3;
		area=lado*lado;
		
		System.out.println("---- AREA DE UN CUADRADO ------");
		System.out.println(area);
		System.out.println("-------------------------------");
		//Circulo
		float pi=3.14f;
		int radio=3;
		area=pi*radio*radio;

		System.out.println("---- AREA DE UN CIRCULO ------");
		System.out.println(area);
		System.out.println("-------------------------------");
		
		//Cuadrado
		int base=3;
		int altura=6;
		area=base*altura;
		
		System.out.println("---- AREA DE UN RECTANGULO ------");
		System.out.println(area);
		System.out.println("-------------------------------");
	}

}
