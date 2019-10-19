public class Main{

	public static void main(String[] xss){
		Matriz m1 = new Matriz(3,3);
		Matriz m2 = new Matriz(4,4);
		m1.asignarEntrada(14,0,0);
		m1.asignarEntrada(22,1,1);
		m1.asignarEntrada(33,2,2);
		m2.asignarEntrada(14,0,0);
		m2.asignarEntrada(22,1,1);
		m2.asignarEntrada(33,2,2);
		m2.asignarEntrada(100,3,3);

		//System.out.println("\nEl numero obtenido es:"+ m1.obtenerEntrada(0,1));
		//System.out.println(m1.suma(m2));
		System.out.println("matriz 2");
		System.out.println(m2);
		System.out.println("elimino la fila 0");
		System.out.println(m2.eliminarFila(0));
		System.out.println("elimino la fila 1");
		System.out.println(m2.eliminarFila(1));
		System.out.println("elimino la fila 2");
		System.out.println(m2.eliminarFila(2));
		System.out.println("elimino la fila 3"); 
		System.out.println(m2.eliminarFila(3));
		System.out.println();  
		System.out.println();
	        
		//System.out.println(m1.escalar(3));
		System.out.println("matriz 1");
		System.out.println(m1);
		System.out.println("elimino la columna 0");
		System.out.println(m1.eliminarColumna(0));
		System.out.println("elimino la columna 1");
		System.out.println(m1.eliminarColumna(1));
		System.out.println("elimino la columna 2");
		System.out.println(m1.eliminarColumna(2));
		System.out.println();
		System.out.println();





	}


}
