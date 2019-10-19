public class Matriz{
	private double[][] datos;
	private int m, n;


	public Matriz(int m, int n){
		this.m = m;
		this.n = n;
		datos = new double[m][n];
	}

	public Matriz(double[][] array, int m, int n ) {
		this.m = m;
		this.n = n;
		this.datos = array;
	}

	public double obtenerEntrada(int i, int j){
		double x;
		x = this.datos[i][j];
		return x;
	}

	public void asignarEntrada(double dato,int i, int j){
		this.datos[i][j]= dato;
	}

	public Matriz suma(Matriz otra){
		Matriz suma = new Matriz(m,n);
		double x;
		for(int i = 0; i < datos.length ; i++){
			for(int k = 0; k < datos[i].length; k++){
				x = this.datos[i][k] + otra.obtenerEntrada(i,k);
				suma.asignarEntrada(x,i,k);
			}
		}
		return suma;
	}

	public Matriz escalar(double c){
		Matriz escalar = new Matriz(m,n);
		double x;
		for(int i = 0; i < datos.length ; i++){
			for(int k = 0; k < datos[i].length; k++){
				x = this.datos[i][k] * c;
				escalar.asignarEntrada(x,i,k);
			}
		}
		return escalar;
	}

	public Matriz eliminarFila(int k){
		Matriz eliminar = new Matriz(m-1,n);
		double x;
		int j=0;
		for(int i = 0; i< datos.length; i++){
			if(i != k ){
				for(j=0 ; j <datos[i].length;j++){
					x = this.datos[i][j];
					eliminar.asignarEntrada(x,i,j);
				}
			}else if(k == datos.length -1){
				i++;
				}

			else{
				for(j=0 ; j <datos[i].length;j++){
					x = this.datos[i+1][j];
					eliminar.asignarEntrada(x,i,j);
				}
				k ++;
		       	}
		}
		return eliminar;
	}

	public Matriz eliminarColumna(int k){

		Matriz eliminarC = new Matriz(m,n-1);
		double x;
		
		for(int i=0; i < m; i++){
			for(int j=0, currColumn = 0; j< n; j++){
				if(j != k){
					x= this.datos[i][j];
					eliminarC.asignarEntrada(x,i,currColumn++);
					/*
				}else if(k == datos[i].length-1){
					//j++;
				}else{
					x = this.datos[i][j+1];
					eliminarC.asignarEntrada(x,i,j);
					k++;
					**/
				}
	        	}
		}

		return eliminarC;
	}


	public String toString(){

		String imprimir = "";
	
		for(int i= 0; i < datos.length; i++){
			for(int k=0; k < datos[i].length; k++){
				imprimir += String.valueOf(datos[i][k]) + " ";
			} imprimir += "\n";
		}return imprimir;
	}

}
