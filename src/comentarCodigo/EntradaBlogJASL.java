package comentarCodigo;

public class EntradaBlogJASL {

		/**
		 * Clase para crear las entradas de un blog
		 * @author Juan Alberto
		 * @version 2.1
		 * @since 2021-02-08
		 */
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		//Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
		//de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
		//es negativo, lanza una excepci�n.
		
		/**
		 * M�todo constructor que realiza la entrada al blog
		 * @param id primer parametro de tipo int que muestra id de la entrada 
		 * @param autor segundo par�metro que indica el autor de la nueva entrada
		 * @param texto tercer par�metro que muestra el texto introducido.
		 * @throws IllegalArgumentException
		 */
		public EntradaBlogJASL(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		
		/**
		 * M�todo toString que retorna una cadena de car�cteres con los datos introducidos.
		 */
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * M�todo para obtener el id.
		 * @return retorna el id de la entrada.
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * M�todo para obtener el texto de la entrada.
		 * @return devuelve una cadena de car�cteres que muestra la entrada del blog.
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * M�todo getAutor
		 * @return devuelve el nombre del autor en may�sculas.
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * M�todo devuelveAutor obsoleto, mejor utilizar getAutor.
		 * @return devuelve el nombre del autor.
		 *
		 *public String devuelveAutor(){
		 *	return this.autor;
		 * }
		 */
		
		/**
		 * M�todo main
		 * @param args no tiene porque tener argumentos.
		 */
		public static void main(String[] args) {
	                //Modificar.
			EntradaBlogJASL e1=new EntradaBlogJASL (3,"Ana","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
	
}
