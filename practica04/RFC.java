import java.util.Scanner;

public class RFC {
	public static void main(String[] args) {
		System.out.println("Introduce tu nombre completo");
		Scanner scannerNombre = new Scanner(System.in);
		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa");
                Scanner scannerFecha = new Scanner(System.in);

		String nombre = scannerNombre.next();
		String ApellidoPaterno = scannerNombre.next();
		String ApellidoMaterno = scannerNombre.next();
		String fecha = scannerFecha.next();
		String letraDelNombre = nombre.substring(0,1);
		String letrasDelApellidoPaterno =  ApellidoPaterno.substring(0,2);
                String letraDelApellidoMaterno = ApellidoMaterno.substring(0,1);
		String digitosDelAno = fecha.substring(8,10);
		String digitosDelMes = fecha.substring(3,5);
		String digitosDeldia = fecha.substring(0,2);

		/*
		System.out.println(nombre);
		System.out.println(ApellidoMaterno);
		System.out.println(ApellidoPaterno);
		System.out.println(fecha);
		System.out.println(letrasDelApellidoPaterno);
		System.out.println(letraDelApellidoMaterno);
		System.out.println(letraDelNombre);
		System.out.println(digitosDelAno);
		System.out.println(digitosDelMes);
		System.out.println(digitosDeldia);
		*/
		

		System.out.println("El RFC de" + ' ' + nombre + ' ' +  ApellidoPaterno + ' ' +  ApellidoMaterno +  ' ' + "es:" + ' ' + letrasDelApellidoPaterno.toUpperCase() + letraDelApellidoMaterno.toUpperCase() + letraDelNombre.toUpperCase() + digitosDelAno.toUpperCase() + digitosDelMes.toUpperCase() + digitosDeldia.toUpperCase());

		
	}
}
