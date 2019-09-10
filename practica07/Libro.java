/*
 *
 * @author Villarreal Maldonado Jorge Manuel 
 * @version 1.0
 * En este programas estudiamos la documentacion y como crearla. 
 * hicimos un breve repaso de constructor.
 */

	public class Libro {

//Atributos

public String author, titulo;
public int anioDePublicacion;


				//Constructor: el cual pone por default que inicializa con los valores asignados.

				public Libro (){

					this.author = "ect";
                                        this.titulo = " ";
                                        this.anioDePublicacion = 0;



		}



				//Constructor: Por ultimo ingresamos otro constructor con los parametros dichos.

				public Libro (String author, String titulo,int anioDePublicacion ){
				
					this.author = author;
					this.titulo = titulo;
					this.anioDePublicacion = anioDePublicacion;

		}

}
