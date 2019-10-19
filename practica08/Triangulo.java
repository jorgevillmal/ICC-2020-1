//@autor Villarreal Maldonado Jorge Manuel

import java.lang.Math;
import java.lang.Object;

public class Triangulo{ 

	//Declaramos los atributos

	private Punto a;
	private Punto b;
	private Punto c;

	public static final int EQUILATERO = 0;
	public static final int ESCALENO = 2;
	public static final int ISOSCELES = 1;

	//Metodo default

	public Triangulo(){
			
		a = new Punto (0, 0);
		b = new Punto (1, 0);
		c = new Punto (0.5,Math.sin(Math.PI / 3));

	}

	//Metodo al cual le asignamos parametros
	public Triangulo(Punto a, Punto b, Punto c){

		this.a = a;  
		this.b = b;  
		this.c = c;  
	
	
	}


	//Creando un metodo para identificar si los puntos estan aliniados

	public boolean tieneVerticesAlineados(){
	
	return a.estanAlineados(b, c);
	
	} 
	
	public int tipo(){
		boolean p,q,r;
			
		p = a.distancia(b) == b.distancia(c);
		q = b.distancia(c) == c.distancia(a);
		r = c.distancia(a) == a.distancia(b);

		if (p && q){
			return EQUILATERO;

		}else if(p || q || r){

			return ISOSCELES;
		
		}else return ESCALENO;
	

	
	
	
	}

	public Punto getA(){
	
		return a;
	
	}

	public Punto getB(){
	
		return b;
	
	}

	public Punto getC(){
	
		return c;
	
	}






}
