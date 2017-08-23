package Clases;

public class Entidad {
	int idEntidad;
	String Nombre;
	
	
	
	
	
	public int getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	public Entidad(int idEntidad, String nombre) {
		super();
		this.idEntidad = idEntidad;
		Nombre = nombre;
	}
	
	
	
	
}
