package Clases;

import java.util.List;

public class Rol {

	
	int idRol;
	String nombre;
	List<Permiso> permisos;
	List<Usuario> usuarios;
	
	
	
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Permiso> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	public Rol(int idRol, String nombre, List<Permiso> permisos, List<Usuario> usuarios) {
		super();
		this.idRol = idRol;
		this.nombre = nombre;
		this.permisos = permisos;
		this.usuarios = usuarios;
	}
}
