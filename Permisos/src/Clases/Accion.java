package Clases;

public class Accion {

	int idAccion;
	String nombre;
	
	
	public int getIdAccion() {
		return idAccion;
	}
	public void setIdAccion(int idAccion) {
		this.idAccion = idAccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Accion(int idAccion, String nombre) {
		super();
		this.idAccion = idAccion;
		this.nombre = nombre;
	}
	
	
}
