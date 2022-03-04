package Ejercicio2;

public class Instituto {

	/**
	 * Variables
	 */
	String nombre, direccion;
	int numAlumnos;
	boolean bilingue;

	/**
	 * Constructor por defecto
	 */
	public Instituto() {
	}

	/**
	 * M�todo parametrizado
	 * 
	 * @param nombre
	 * @param direccion
	 * @param numAlumnos
	 * @param bilingue
	 */
	public Instituto(String nombre, String direccion, int numAlumnos, boolean bilingue) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.numAlumnos = numAlumnos;
		this.bilingue = bilingue;

	}

	/**
	 * M�todo get que devuelve el nombre
	 * 
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo set que recoje el nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo get que devuelve la direcci�n
	 * 
	 * @return direcion
	 */

	public String getDireccion() {
		return direccion;
	}

	/**
	 * M�todo set que recoje la direci�n
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * M�todo get que devuelve el numero de alumnos
	 * 
	 * @return numAlumnos
	 */
	public int getNumAlumnos() {
		return numAlumnos;
	}

	/**
	 * M�todo set que recoje el numero de alumnos
	 * 
	 * @param numAlumnos
	 */
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	/**
	 * M�todo get que devuelve el si es bilingue o no
	 * 
	 * @return bilingue
	 */
	public boolean isBilingue() {
		return bilingue;
	}

	/**
	 * M�todo set que recoje si es bilingue o no
	 * 
	 * @param bilingue
	 */
	public void setBilingue(boolean bilingue) {
		this.bilingue = bilingue;
	}

}
